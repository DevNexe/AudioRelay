package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nd5<T> implements nz0<T> {
    public final la0 w;
    public final Object x;
    public final QnHx y;

    @if0(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<T, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ nz0<T> C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(nz0<? super T> nz0Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = nz0Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.C, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type z80 to nd5$QnHx for r3v1 'this'  z80
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.m8
        public final java.lang.Object i(java.lang.Object r4) {
            /*
                r3 = this;
                va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
                int r1 = r3.A
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                defpackage.C0239D.H(r4)
                goto L25
            Ld:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L15:
                defpackage.C0239D.H(r4)
                java.lang.Object r4 = r3.B
                r3.A = r2
                nz0<T> r1 = r3.C
                java.lang.Object r4 = r1.f(r4, r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                sd5 r4 = defpackage.sd5.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: nd5.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(Object obj, z80<? super sd5> z80Var) {
            return ((QnHx) a(obj, z80Var)).i(sd5.a);
        }
    }

    public nd5(nz0<? super T> nz0Var, la0 la0Var) {
        this.w = la0Var;
        this.x = la0Var.i(0, e75.b);
        this.y = new QnHx(nz0Var, null);
    }

    @Override // defpackage.nz0
    public final Object f(T t, z80<? super sd5> z80Var) {
        QnHx qnHx = this.y;
        la0 la0Var = this.w;
        Object objB = e75.b(la0Var, this.x);
        try {
            lr4 lr4Var = new lr4(z80Var, la0Var);
            sb5.d(2, qnHx);
            Object objInvoke = qnHx.invoke(t, lr4Var);
            e75.a(la0Var, objB);
            return objInvoke == va0.COROUTINE_SUSPENDED ? objInvoke : sd5.a;
        } catch (Throwable th) {
            e75.a(la0Var, objB);
            throw th;
        }
    }
}
