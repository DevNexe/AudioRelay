package j$.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
final class h extends m {
    final m[] e;

    h(m[] mVarArr) {
        super(-1, null, null, null);
        this.e = mVarArr;
    }

    @Override // j$.util.concurrent.m
    final m a(int i, Object obj) {
        int length;
        m mVarM;
        Object obj2;
        m[] mVarArr = this.e;
        loop0: while (obj != null && mVarArr != null && (length = mVarArr.length) != 0 && (mVarM = ConcurrentHashMap.m(mVarArr, (length - 1) & i)) != null) {
            do {
                int i2 = mVarM.a;
                if (i2 == i && ((obj2 = mVarM.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return mVarM;
                }
                if (i2 >= 0) {
                    mVarM = mVarM.d;
                } else {
                    if (!(mVarM instanceof h)) {
                        return mVarM.a(i, obj);
                    }
                    mVarArr = ((h) mVarM).e;
                }
            } while (mVarM != null);
        }
        return null;
    }
}
