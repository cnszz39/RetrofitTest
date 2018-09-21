package services

import io.reactivex.functions.Function
import model.BaseResponseSingleData

class PayLoad<T> : Function<BaseResponseSingleData<T>, T> {
    override fun apply(p0: BaseResponseSingleData<T>): T {
        if (p0.errorCode != 0) {
            throw Fault(p0.errorCode, p0.errorMsg)
        }
        return p0.data
    }
}