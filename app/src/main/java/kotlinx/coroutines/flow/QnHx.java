package kotlinx.coroutines.flow;

import defpackage.FWT;
import defpackage.b90;
import defpackage.if0;
import defpackage.la0;
import defpackage.lg;
import defpackage.ms1;
import defpackage.mz0;
import defpackage.nz0;
import defpackage.py4;
import defpackage.q91;
import defpackage.roZB;
import defpackage.sd5;
import defpackage.si2;
import defpackage.uo;
import defpackage.ur1;
import defpackage.v3A;
import defpackage.xm;
import defpackage.z2n;
import defpackage.z80;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class QnHx<T> extends roZB<CQf> implements si2<T>, mz0, q91<T> {
    public int A;
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.QnHx$QnHx, reason: collision with other inner class name */
    @if0(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, 403}, m = "collect")
    public static final class C0157QnHx extends b90 {
        public nz0 A;
        public CQf B;
        public ms1 C;
        public Object D;
        public /* synthetic */ Object E;
        public final /* synthetic */ QnHx<T> F;
        public int G;
        public QnHx z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0157QnHx(QnHx<T> qnHx, z80<? super C0157QnHx> z80Var) {
            super(z80Var);
            this.F = qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.E = obj;
            this.G |= Integer.MIN_VALUE;
            return this.F.a(null, this);
        }
    }

    public QnHx(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0097 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:14:0x003a, B:34:0x0093, B:36:0x0097, B:39:0x009e, B:40:0x00a2, B:42:0x00a5, B:52:0x00c6, B:57:0x00dc, B:58:0x00f4, B:64:0x0107, B:65:0x010c, B:68:0x0113, B:61:0x00ff, B:44:0x00ab, B:48:0x00b2, B:19:0x0051, B:22:0x005d, B:33:0x0085), top: B:76:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:14:0x003a, B:34:0x0093, B:36:0x0097, B:39:0x009e, B:40:0x00a2, B:42:0x00a5, B:52:0x00c6, B:57:0x00dc, B:58:0x00f4, B:64:0x0107, B:65:0x010c, B:68:0x0113, B:61:0x00ff, B:44:0x00ab, B:48:0x00b2, B:19:0x0051, B:22:0x005d, B:33:0x0085), top: B:76:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:14:0x003a, B:34:0x0093, B:36:0x0097, B:39:0x009e, B:40:0x00a2, B:42:0x00a5, B:52:0x00c6, B:57:0x00dc, B:58:0x00f4, B:64:0x0107, B:65:0x010c, B:68:0x0113, B:61:0x00ff, B:44:0x00ab, B:48:0x00b2, B:19:0x0051, B:22:0x005d, B:33:0x0085), top: B:76:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:14:0x003a, B:34:0x0093, B:36:0x0097, B:39:0x009e, B:40:0x00a2, B:42:0x00a5, B:52:0x00c6, B:57:0x00dc, B:58:0x00f4, B:64:0x0107, B:65:0x010c, B:68:0x0113, B:61:0x00ff, B:44:0x00ab, B:48:0x00b2, B:19:0x0051, B:22:0x005d, B:33:0x0085), top: B:76:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ff A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:14:0x003a, B:34:0x0093, B:36:0x0097, B:39:0x009e, B:40:0x00a2, B:42:0x00a5, B:52:0x00c6, B:57:0x00dc, B:58:0x00f4, B:64:0x0107, B:65:0x010c, B:68:0x0113, B:61:0x00ff, B:44:0x00ab, B:48:0x00b2, B:19:0x0051, B:22:0x005d, B:33:0x0085), top: B:76:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0107 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:14:0x003a, B:34:0x0093, B:36:0x0097, B:39:0x009e, B:40:0x00a2, B:42:0x00a5, B:52:0x00c6, B:57:0x00dc, B:58:0x00f4, B:64:0x0107, B:65:0x010c, B:68:0x0113, B:61:0x00ff, B:44:0x00ab, B:48:0x00b2, B:19:0x0051, B:22:0x005d, B:33:0x0085), top: B:76:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0112  */
    /* JADX WARN: Code duplicated, block: B:68:0x0113 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:14:0x003a, B:34:0x0093, B:36:0x0097, B:39:0x009e, B:40:0x00a2, B:42:0x00a5, B:52:0x00c6, B:57:0x00dc, B:58:0x00f4, B:64:0x0107, B:65:0x010c, B:68:0x0113, B:61:0x00ff, B:44:0x00ab, B:48:0x00b2, B:19:0x0051, B:22:0x005d, B:33:0x0085), top: B:76:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0117 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:57:0x00dc
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mj4, defpackage.mz0
    public final java.lang.Object a(defpackage.nz0<? super T> r19, defpackage.z80<?> r20) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.QnHx.a(nz0, z80):java.lang.Object");
    }

    @Override // defpackage.si2
    public final boolean b(T t, T t2) {
        py4 py4Var = v3A.x;
        if (t == null) {
            t = (T) py4Var;
        }
        if (t2 == null) {
            t2 = (T) py4Var;
        }
        return l(t, t2);
    }

    @Override // defpackage.q91
    public final mz0<T> c(la0 la0Var, int i, lg lgVar) {
        return ((((i >= 0 && i < 2) || i == -2) && lgVar == lg.DROP_OLDEST) || ((i == 0 || i == -3) && lgVar == lg.SUSPEND)) ? this : new uo(i, la0Var, lgVar, this);
    }

    @Override // defpackage.pi2
    public final void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.pi2
    public final boolean e(T t) {
        setValue(t);
        return true;
    }

    @Override // defpackage.nz0
    public final Object f(T t, z80<? super sd5> z80Var) {
        setValue(t);
        return sd5.a;
    }

    @Override // defpackage.si2, defpackage.js4
    public final T getValue() {
        py4 py4Var = v3A.x;
        T t = (T) this._state;
        if (t == py4Var) {
            return null;
        }
        return t;
    }

    @Override // defpackage.roZB
    public final z2n i() {
        return new CQf();
    }

    @Override // defpackage.roZB
    public final z2n[] j() {
        return new CQf[2];
    }

    public final boolean l(Object obj, Object obj2) {
        int i;
        Object obj3;
        py4 py4Var;
        boolean z;
        boolean z2;
        synchronized (this) {
            Object obj4 = this._state;
            if (obj != null && !ur1.a(obj4, obj)) {
                return false;
            }
            if (ur1.a(obj4, obj2)) {
                return true;
            }
            this._state = obj2;
            int i2 = this.A;
            if ((i2 & 1) != 0) {
                this.A = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.A = i3;
            Object obj5 = this.w;
            sd5 sd5Var = sd5.a;
            while (true) {
                CQf[] cQfArr = (CQf[]) obj5;
                if (cQfArr != null) {
                    for (CQf cQf : cQfArr) {
                        if (cQf != null) {
                            while (true) {
                                Object obj6 = cQf._state;
                                if (obj6 == null || obj6 == (py4Var = FWT.z)) {
                                    break;
                                }
                                py4 py4Var2 = FWT.y;
                                if (obj6 != py4Var2) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CQf.a;
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(cQf, obj6, py4Var2)) {
                                            z2 = true;
                                            break;
                                        }
                                        if (atomicReferenceFieldUpdater.get(cQf) != obj6) {
                                            z2 = false;
                                            break;
                                        }
                                    }
                                    if (z2) {
                                        ((xm) obj6).x(sd5.a);
                                        break;
                                    }
                                } else {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = CQf.a;
                                    while (true) {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(cQf, obj6, py4Var)) {
                                            z = true;
                                            break;
                                        }
                                        if (atomicReferenceFieldUpdater2.get(cQf) != obj6) {
                                            z = false;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.A;
                    if (i == i3) {
                        this.A = i3 + 1;
                        return true;
                    }
                    obj3 = this.w;
                    sd5 sd5Var2 = sd5.a;
                }
                obj5 = obj3;
                i3 = i;
            }
        }
    }

    @Override // defpackage.si2
    public final void setValue(T t) {
        if (t == null) {
            t = (T) v3A.x;
        }
        l(null, t);
    }
}
