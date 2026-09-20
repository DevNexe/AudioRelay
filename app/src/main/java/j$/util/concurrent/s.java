package j$.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
final class s extends m {
    s e;
    s f;
    s g;
    s h;
    boolean i;

    s(int i, Object obj, Object obj2, s sVar, s sVar2) {
        super(i, obj, obj2, sVar);
        this.e = sVar2;
    }

    @Override // j$.util.concurrent.m
    final m a(int i, Object obj) {
        return b(i, obj, null);
    }

    final s b(int i, Object obj, Class cls) {
        int iD;
        if (obj == null) {
            return null;
        }
        s sVar = this;
        do {
            s sVar2 = sVar.f;
            s sVar3 = sVar.g;
            int i2 = sVar.a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = sVar.b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return sVar;
                    }
                    if (sVar2 != null) {
                        if (sVar3 != null) {
                            if ((cls == null && (cls = ConcurrentHashMap.c(obj)) == null) || (iD = ConcurrentHashMap.d(cls, obj, obj2)) == 0) {
                                s sVarB = sVar3.b(i, obj, cls);
                                if (sVarB != null) {
                                    return sVarB;
                                }
                            } else if (iD >= 0) {
                                sVar2 = sVar3;
                            }
                        }
                        sVar = sVar2;
                    }
                }
                sVar = sVar3;
            } else {
                sVar = sVar2;
            }
        } while (sVar != null);
        return null;
    }
}
