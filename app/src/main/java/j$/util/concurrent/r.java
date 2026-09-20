package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class r extends m {
    private static final Unsafe h;
    private static final long i;
    s e;
    volatile s f;
    volatile Thread g;
    volatile int lockState;

    static {
        try {
            Unsafe unsafeC = w.c();
            h = unsafeC;
            i = unsafeC.objectFieldOffset(r.class.getDeclaredField("lockState"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    r(s sVar) {
        int iD;
        int iJ;
        super(-2, null, null, null);
        this.f = sVar;
        s sVar2 = null;
        while (sVar != null) {
            s sVar3 = (s) sVar.d;
            sVar.g = null;
            sVar.f = null;
            if (sVar2 == null) {
                sVar.e = null;
                sVar.i = false;
            } else {
                Object obj = sVar.b;
                int i2 = sVar.a;
                s sVar4 = sVar2;
                Class clsC = null;
                while (true) {
                    Object obj2 = sVar4.b;
                    int i3 = sVar4.a;
                    iJ = i3 > i2 ? -1 : i3 < i2 ? 1 : ((clsC == null && (clsC = ConcurrentHashMap.c(obj)) == null) || (iD = ConcurrentHashMap.d(clsC, obj, obj2)) == 0) ? j(obj, obj2) : iD;
                    s sVar5 = iJ <= 0 ? sVar4.f : sVar4.g;
                    if (sVar5 == null) {
                        break;
                    } else {
                        sVar4 = sVar5;
                    }
                }
                sVar.e = sVar4;
                if (iJ <= 0) {
                    sVar4.f = sVar;
                } else {
                    sVar4.g = sVar;
                }
                sVar = c(sVar2, sVar);
            }
            sVar2 = sVar;
            sVar = sVar3;
        }
        this.e = sVar2;
    }

    static s b(s sVar, s sVar2) {
        while (sVar2 != null && sVar2 != sVar) {
            s sVar3 = sVar2.e;
            if (sVar3 == null) {
                sVar2.i = false;
                return sVar2;
            }
            if (sVar2.i) {
                sVar2.i = false;
                return sVar;
            }
            s sVar4 = sVar3.f;
            if (sVar4 == sVar2) {
                sVar4 = sVar3.g;
                if (sVar4 != null && sVar4.i) {
                    sVar4.i = false;
                    sVar3.i = true;
                    sVar = h(sVar, sVar3);
                    sVar3 = sVar2.e;
                    sVar4 = sVar3 == null ? null : sVar3.g;
                }
                if (sVar4 != null) {
                    s sVar5 = sVar4.f;
                    s sVar6 = sVar4.g;
                    if ((sVar6 == null || !sVar6.i) && (sVar5 == null || !sVar5.i)) {
                        sVar4.i = true;
                    } else {
                        if (sVar6 == null || !sVar6.i) {
                            if (sVar5 != null) {
                                sVar5.i = false;
                            }
                            sVar4.i = true;
                            sVar = i(sVar, sVar4);
                            sVar3 = sVar2.e;
                            sVar4 = sVar3 != null ? sVar3.g : null;
                        }
                        if (sVar4 != null) {
                            sVar4.i = sVar3 == null ? false : sVar3.i;
                            s sVar7 = sVar4.g;
                            if (sVar7 != null) {
                                sVar7.i = false;
                            }
                        }
                        if (sVar3 != null) {
                            sVar3.i = false;
                            sVar = h(sVar, sVar3);
                        }
                        sVar2 = sVar;
                        sVar = sVar2;
                    }
                }
                sVar2 = sVar3;
            } else {
                if (sVar4 != null && sVar4.i) {
                    sVar4.i = false;
                    sVar3.i = true;
                    sVar = i(sVar, sVar3);
                    sVar3 = sVar2.e;
                    sVar4 = sVar3 == null ? null : sVar3.f;
                }
                if (sVar4 != null) {
                    s sVar8 = sVar4.f;
                    s sVar9 = sVar4.g;
                    if ((sVar8 == null || !sVar8.i) && (sVar9 == null || !sVar9.i)) {
                        sVar4.i = true;
                    } else {
                        if (sVar8 == null || !sVar8.i) {
                            if (sVar9 != null) {
                                sVar9.i = false;
                            }
                            sVar4.i = true;
                            sVar = h(sVar, sVar4);
                            sVar3 = sVar2.e;
                            sVar4 = sVar3 != null ? sVar3.f : null;
                        }
                        if (sVar4 != null) {
                            sVar4.i = sVar3 == null ? false : sVar3.i;
                            s sVar10 = sVar4.f;
                            if (sVar10 != null) {
                                sVar10.i = false;
                            }
                        }
                        if (sVar3 != null) {
                            sVar3.i = false;
                            sVar = i(sVar, sVar3);
                        }
                        sVar2 = sVar;
                        sVar = sVar2;
                    }
                }
                sVar2 = sVar3;
            }
        }
        return sVar;
    }

    static s c(s sVar, s sVar2) {
        s sVar3;
        sVar2.i = true;
        while (true) {
            s sVar4 = sVar2.e;
            if (sVar4 == null) {
                sVar2.i = false;
                return sVar2;
            }
            if (!sVar4.i || (sVar3 = sVar4.e) == null) {
                return sVar;
            }
            s sVar5 = sVar3.f;
            if (sVar4 == sVar5) {
                sVar5 = sVar3.g;
                if (sVar5 == null || !sVar5.i) {
                    if (sVar2 == sVar4.g) {
                        sVar = h(sVar, sVar4);
                        s sVar6 = sVar4.e;
                        sVar3 = sVar6 == null ? null : sVar6.e;
                        sVar4 = sVar6;
                        sVar2 = sVar4;
                    }
                    if (sVar4 != null) {
                        sVar4.i = false;
                        if (sVar3 != null) {
                            sVar3.i = true;
                            sVar = i(sVar, sVar3);
                        }
                    }
                } else {
                    sVar5.i = false;
                    sVar4.i = false;
                    sVar3.i = true;
                    sVar2 = sVar3;
                }
            } else if (sVar5 == null || !sVar5.i) {
                if (sVar2 == sVar4.f) {
                    sVar = i(sVar, sVar4);
                    s sVar7 = sVar4.e;
                    sVar3 = sVar7 == null ? null : sVar7.e;
                    sVar4 = sVar7;
                    sVar2 = sVar4;
                }
                if (sVar4 != null) {
                    sVar4.i = false;
                    if (sVar3 != null) {
                        sVar3.i = true;
                        sVar = h(sVar, sVar3);
                    }
                }
            } else {
                sVar5.i = false;
                sVar4.i = false;
                sVar3.i = true;
                sVar2 = sVar3;
            }
        }
    }

    private final void d() {
        boolean z = false;
        while (true) {
            int i2 = this.lockState;
            if ((i2 & (-3)) == 0) {
                if (h.compareAndSwapInt(this, i, i2, 1)) {
                    break;
                }
            } else if ((i2 & 2) == 0) {
                if (h.compareAndSwapInt(this, i, i2, i2 | 2)) {
                    this.g = Thread.currentThread();
                    z = true;
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.g = null;
        }
    }

    private final void e() {
        if (h.compareAndSwapInt(this, i, 0, 1)) {
            return;
        }
        d();
    }

    static s h(s sVar, s sVar2) {
        s sVar3 = sVar2.g;
        if (sVar3 != null) {
            s sVar4 = sVar3.f;
            sVar2.g = sVar4;
            if (sVar4 != null) {
                sVar4.e = sVar2;
            }
            s sVar5 = sVar2.e;
            sVar3.e = sVar5;
            if (sVar5 == null) {
                sVar3.i = false;
                sVar = sVar3;
            } else if (sVar5.f == sVar2) {
                sVar5.f = sVar3;
            } else {
                sVar5.g = sVar3;
            }
            sVar3.f = sVar2;
            sVar2.e = sVar3;
        }
        return sVar;
    }

    static s i(s sVar, s sVar2) {
        s sVar3 = sVar2.f;
        if (sVar3 != null) {
            s sVar4 = sVar3.g;
            sVar2.f = sVar4;
            if (sVar4 != null) {
                sVar4.e = sVar2;
            }
            s sVar5 = sVar2.e;
            sVar3.e = sVar5;
            if (sVar5 == null) {
                sVar3.i = false;
                sVar = sVar3;
            } else if (sVar5.g == sVar2) {
                sVar5.g = sVar3;
            } else {
                sVar5.f = sVar3;
            }
            sVar3.g = sVar2;
            sVar2.e = sVar3;
        }
        return sVar;
    }

    static int j(Object obj, Object obj2) {
        int iCompareTo;
        if (obj == null || obj2 == null || (iCompareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
        }
        return iCompareTo;
    }

    @Override // j$.util.concurrent.m
    final m a(int i2, Object obj) {
        Object obj2;
        Thread thread;
        s sVarB = null;
        if (obj != null) {
            m mVar = this.f;
            while (mVar != null) {
                int i3 = this.lockState;
                if ((i3 & 3) != 0) {
                    if (mVar.a == i2 && ((obj2 = mVar.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                        return mVar;
                    }
                    mVar = mVar.d;
                } else if (h.compareAndSwapInt(this, i, i3, i3 + 4)) {
                    try {
                        s sVar = this.e;
                        if (sVar != null) {
                            sVarB = sVar.b(i2, obj, null);
                        }
                        return sVarB;
                    } finally {
                        if (w.a(h, this, i) == 6 && (thread = this.g) != null) {
                            LockSupport.unpark(thread);
                        }
                    }
                }
            }
        }
        return null;
    }

    final s f(int i2, Object obj, Object obj2) {
        int iD;
        int iJ;
        s sVar;
        s sVarB;
        s sVar2 = this.e;
        Class clsC = null;
        boolean z = false;
        while (sVar2 != null) {
            int i3 = sVar2.a;
            if (i3 > i2) {
                iJ = -1;
            } else if (i3 < i2) {
                iJ = 1;
            } else {
                Object obj3 = sVar2.b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return sVar2;
                }
                if ((clsC == null && (clsC = ConcurrentHashMap.c(obj)) == null) || (iD = ConcurrentHashMap.d(clsC, obj, obj3)) == 0) {
                    if (!z) {
                        s sVar3 = sVar2.f;
                        if ((sVar3 != null && (sVarB = sVar3.b(i2, obj, clsC)) != null) || ((sVar = sVar2.g) != null && (sVarB = sVar.b(i2, obj, clsC)) != null)) {
                            return sVarB;
                        }
                        z = true;
                    }
                    iJ = j(obj, obj3);
                } else {
                    iJ = iD;
                }
            }
            s sVar4 = iJ <= 0 ? sVar2.f : sVar2.g;
            if (sVar4 == null) {
                s sVar5 = this.f;
                s sVar6 = new s(i2, obj, obj2, sVar5, sVar2);
                this.f = sVar6;
                if (sVar5 != null) {
                    sVar5.h = sVar6;
                }
                if (iJ <= 0) {
                    sVar2.f = sVar6;
                } else {
                    sVar2.g = sVar6;
                }
                if (sVar2.i) {
                    e();
                    try {
                        this.e = c(this.e, sVar6);
                    } finally {
                        this.lockState = 0;
                    }
                } else {
                    sVar6.i = true;
                }
                return null;
            }
            sVar2 = sVar4;
        }
        s sVar7 = new s(i2, obj, obj2, null, null);
        this.e = sVar7;
        this.f = sVar7;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x008b A[PHI: r0
  0x008b: PHI (r0v4 j$.util.concurrent.s) = (r0v3 j$.util.concurrent.s), (r0v12 j$.util.concurrent.s) binds: [B:53:0x0087, B:49:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    final boolean g(s sVar) {
        s sVar2;
        s sVar3;
        s sVar4 = (s) sVar.d;
        s sVar5 = sVar.h;
        if (sVar5 == null) {
            this.f = sVar4;
        } else {
            sVar5.d = sVar4;
        }
        if (sVar4 != null) {
            sVar4.h = sVar5;
        }
        if (this.f == null) {
            this.e = null;
            return true;
        }
        s sVarB = this.e;
        if (sVarB == null || sVarB.g == null || (sVar2 = sVarB.f) == null || sVar2.f == null) {
            return true;
        }
        e();
        try {
            s sVar6 = sVar.f;
            s sVar7 = sVar.g;
            if (sVar6 != null && sVar7 != null) {
                s sVar8 = sVar7;
                while (true) {
                    s sVar9 = sVar8.f;
                    if (sVar9 == null) {
                        break;
                    }
                    sVar8 = sVar9;
                }
                boolean z = sVar8.i;
                sVar8.i = sVar.i;
                sVar.i = z;
                s sVar10 = sVar8.g;
                s sVar11 = sVar.e;
                if (sVar8 == sVar7) {
                    sVar.e = sVar8;
                    sVar8.g = sVar;
                } else {
                    s sVar12 = sVar8.e;
                    sVar.e = sVar12;
                    if (sVar12 != null) {
                        if (sVar8 == sVar12.f) {
                            sVar12.f = sVar;
                        } else {
                            sVar12.g = sVar;
                        }
                    }
                    sVar8.g = sVar7;
                    sVar7.e = sVar8;
                }
                sVar.f = null;
                sVar.g = sVar10;
                if (sVar10 != null) {
                    sVar10.e = sVar;
                }
                sVar8.f = sVar6;
                sVar6.e = sVar8;
                sVar8.e = sVar11;
                if (sVar11 == null) {
                    sVarB = sVar8;
                } else if (sVar == sVar11.f) {
                    sVar11.f = sVar8;
                } else {
                    sVar11.g = sVar8;
                }
                if (sVar10 != null) {
                    sVar6 = sVar10;
                } else {
                    sVar6 = sVar;
                }
            } else if (sVar6 == null) {
                if (sVar7 != null) {
                    sVar6 = sVar7;
                } else {
                    sVar6 = sVar;
                }
            }
            if (sVar6 != sVar) {
                s sVar13 = sVar.e;
                sVar6.e = sVar13;
                if (sVar13 == null) {
                    sVarB = sVar6;
                } else if (sVar == sVar13.f) {
                    sVar13.f = sVar6;
                } else {
                    sVar13.g = sVar6;
                }
                sVar.e = null;
                sVar.g = null;
                sVar.f = null;
            }
            if (!sVar.i) {
                sVarB = b(sVarB, sVar6);
            }
            this.e = sVarB;
            if (sVar == sVar6 && (sVar3 = sVar.e) != null) {
                if (sVar == sVar3.f) {
                    sVar3.f = null;
                } else if (sVar == sVar3.g) {
                    sVar3.g = null;
                }
                sVar.e = null;
            }
            return false;
        } finally {
            this.lockState = 0;
        }
    }
}
