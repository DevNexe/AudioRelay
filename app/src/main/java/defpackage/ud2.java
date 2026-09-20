package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ud2 implements sd2 {
    public final kotlinx.coroutines.flow.QnHx a = FWT.o(gp2.a);

    public static final class CQf implements mz0<jo<ad2>> {
        public final /* synthetic */ mz0 w;

        public static final class QnHx<T> implements nz0 {
            public final /* synthetic */ nz0 w;

            /* JADX INFO: renamed from: ud2$CQf$QnHx$QnHx, reason: collision with other inner class name */
            @if0(c = "com.azefsw.audioconnect.player.network.messages.MessageSenderBusImpl$sendMessage$$inlined$map$1$2", f = "MessageSenderBusImpl.kt", l = {224}, m = "emit")
            public static final class C0208QnHx extends b90 {
                public int A;
                public /* synthetic */ Object z;

                public C0208QnHx(z80 z80Var) {
                    super(z80Var);
                }

                @Override // defpackage.m8
                public final Object i(Object obj) {
                    this.z = obj;
                    this.A |= Integer.MIN_VALUE;
                    return QnHx.this.f(null, this);
                }
            }

            public QnHx(nz0 nz0Var) {
                this.w = nz0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.nz0
            public final Object f(Object obj, z80 z80Var) throws Throwable {
                C0208QnHx c0208QnHx;
                if (z80Var instanceof C0208QnHx) {
                    c0208QnHx = (C0208QnHx) z80Var;
                    int i = c0208QnHx.A;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0208QnHx.A = i - Integer.MIN_VALUE;
                    } else {
                        c0208QnHx = new C0208QnHx(z80Var);
                    }
                } else {
                    c0208QnHx = new C0208QnHx(z80Var);
                }
                Object obj2 = c0208QnHx.z;
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i2 = c0208QnHx.A;
                if (i2 == 0) {
                    C0239D.H(obj2);
                    T t = ((mq4) obj).a;
                    c0208QnHx.A = 1;
                    if (this.w.f(t, c0208QnHx) == va0Var) {
                        return va0Var;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj2);
                }
                return sd5.a;
            }
        }

        public CQf(QnHx qnHx) {
            this.w = qnHx;
        }

        @Override // defpackage.mz0
        public final Object a(nz0<? super jo<ad2>> nz0Var, z80 z80Var) {
            Object objA = this.w.a(new QnHx(nz0Var), z80Var);
            return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
        }
    }

    @if0(c = "com.azefsw.audioconnect.player.network.messages.MessageSenderBusImpl", f = "MessageSenderBusImpl.kt", l = {69, 70}, m = "sendMessage")
    public static final class F1 extends b90 {
        public /* synthetic */ Object A;
        public int C;
        public ad2 z;

        public F1(z80<? super F1> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return ud2.this.b(null, this);
        }
    }

    public static final class QnHx implements mz0<Object> {
        public final /* synthetic */ mz0 w;

        /* JADX INFO: renamed from: ud2$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0209QnHx<T> implements nz0 {
            public final /* synthetic */ nz0 w;

            /* JADX INFO: renamed from: ud2$QnHx$QnHx$QnHx, reason: collision with other inner class name */
            @if0(c = "com.azefsw.audioconnect.player.network.messages.MessageSenderBusImpl$sendMessage$$inlined$filterIsInstance$1$2", f = "MessageSenderBusImpl.kt", l = {224}, m = "emit")
            public static final class C0210QnHx extends b90 {
                public int A;
                public /* synthetic */ Object z;

                public C0210QnHx(z80 z80Var) {
                    super(z80Var);
                }

                @Override // defpackage.m8
                public final Object i(Object obj) {
                    this.z = obj;
                    this.A |= Integer.MIN_VALUE;
                    return C0209QnHx.this.f(null, this);
                }
            }

            public C0209QnHx(nz0 nz0Var) {
                this.w = nz0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.nz0
            public final Object f(Object obj, z80 z80Var) throws Throwable {
                C0210QnHx c0210QnHx;
                if (z80Var instanceof C0210QnHx) {
                    c0210QnHx = (C0210QnHx) z80Var;
                    int i = c0210QnHx.A;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0210QnHx.A = i - Integer.MIN_VALUE;
                    } else {
                        c0210QnHx = new C0210QnHx(z80Var);
                    }
                } else {
                    c0210QnHx = new C0210QnHx(z80Var);
                }
                Object obj2 = c0210QnHx.z;
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i2 = c0210QnHx.A;
                if (i2 == 0) {
                    C0239D.H(obj2);
                    if (obj instanceof mq4) {
                        c0210QnHx.A = 1;
                        if (this.w.f(obj, c0210QnHx) == va0Var) {
                            return va0Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj2);
                }
                return sd5.a;
            }
        }

        public QnHx(kotlinx.coroutines.flow.QnHx qnHx) {
            this.w = qnHx;
        }

        @Override // defpackage.mz0
        public final Object a(nz0<? super Object> nz0Var, z80 z80Var) {
            Object objA = this.w.a(new C0209QnHx(nz0Var), z80Var);
            return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
        }
    }

    public static void c(Throwable th) {
        a62.a.l("Message not sent , exception: " + (th != null ? th.getMessage() : null));
    }

    @Override // defpackage.sd2
    public final void a(ad2 ad2Var) {
        rv2 rv2Var = (rv2) this.a.getValue();
        if (ur1.a(rv2Var, gp2.a)) {
            c(null);
        } else if (rv2Var instanceof mq4) {
            Object objH = ((jo) ((mq4) rv2Var).a).H(ad2Var);
            if (!(objH instanceof ap.CQf)) {
                return;
            }
            c(ap.a(objH));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sd2
    public final Object b(ad2 ad2Var, z80<? super sd5> z80Var) throws Throwable {
        F1 f1;
        if (z80Var instanceof F1) {
            f1 = (F1) z80Var;
            int i = f1.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                f1.C = i - Integer.MIN_VALUE;
            } else {
                f1 = new F1(z80Var);
            }
        } else {
            f1 = new F1(z80Var);
        }
        Object objL = f1.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = f1.C;
        if (i2 != 0) {
            if (i2 == 1) {
                ad2Var = f1.z;
                C0239D.H(objL);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(objL);
            }
            return sd5.a;
        }
        C0239D.H(objL);
        CQf cQf = new CQf(new QnHx(this.a));
        f1.z = ad2Var;
        f1.C = 1;
        objL = kd.l(cQf, f1);
        if (objL == va0Var) {
            return va0Var;
        }
        f1.z = null;
        f1.C = 2;
        if (((jo) objL).p(ad2Var, f1) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }
}
