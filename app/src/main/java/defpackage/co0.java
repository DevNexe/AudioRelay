package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", f = "Draggable.kt", l = {263}, m = "invokeSuspend")
public final class co0 extends px4 implements x81<l93, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ is4<j81<d93, Boolean>> D;
    public final /* synthetic */ is4<h81<Boolean>> E;
    public final /* synthetic */ aw2 F;
    public final /* synthetic */ jo<an0> G;
    public final /* synthetic */ boolean H;

    @if0(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", f = "Draggable.kt", l = {265}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ l93 C;
        public final /* synthetic */ is4<j81<d93, Boolean>> D;
        public final /* synthetic */ is4<h81<Boolean>> E;
        public final /* synthetic */ aw2 F;
        public final /* synthetic */ jo<an0> G;
        public final /* synthetic */ boolean H;

        /* JADX INFO: renamed from: co0$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", f = "Draggable.kt", l = {268, 276}, m = "invokeSuspend")
        public static final class C0067QnHx extends eq3 implements x81<a5, z80<? super sd5>, Object> {
            public aw2 A;
            public ua0 B;
            public boolean C;
            public int D;
            public /* synthetic */ Object E;
            public final /* synthetic */ ua0 F;
            public final /* synthetic */ is4<j81<d93, Boolean>> G;
            public final /* synthetic */ is4<h81<Boolean>> H;
            public final /* synthetic */ aw2 I;
            public final /* synthetic */ jo<an0> J;
            public final /* synthetic */ boolean K;
            public oh5 y;
            public jo z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0067QnHx(ua0 ua0Var, is4<? extends j81<? super d93, Boolean>> is4Var, is4<? extends h81<Boolean>> is4Var2, aw2 aw2Var, jo<an0> joVar, boolean z, z80<? super C0067QnHx> z80Var) {
                super(2, z80Var);
                this.F = ua0Var;
                this.G = is4Var;
                this.H = is4Var2;
                this.I = aw2Var;
                this.J = joVar;
                this.K = z;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                C0067QnHx c0067QnHx = new C0067QnHx(this.F, this.G, this.H, this.I, this.J, this.K, z80Var);
                c0067QnHx.E = obj;
                return c0067QnHx;
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0053  */
            /* JADX WARN: Code duplicated, block: B:21:0x0074 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:22:0x0075  */
            /* JADX WARN: Code duplicated, block: B:25:0x007e  */
            /* JADX WARN: Code duplicated, block: B:30:0x00a4 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
            /* JADX WARN: Code duplicated, block: B:62:0x00fe  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a5 -> B:70:0x00ad). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00f0 -> B:58:0x00f5). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x00fe -> B:63:0x0100). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.m8
            public final java.lang.Object i(java.lang.Object r19) {
                /*
                    Method dump skipped, instruction units count: 262
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: co0.QnHx.C0067QnHx.i(java.lang.Object):java.lang.Object");
            }

            @Override // defpackage.x81
            public final Object invoke(a5 a5Var, z80<? super sd5> z80Var) {
                return ((C0067QnHx) a(a5Var, z80Var)).i(sd5.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(l93 l93Var, is4<? extends j81<? super d93, Boolean>> is4Var, is4<? extends h81<Boolean>> is4Var2, aw2 aw2Var, jo<an0> joVar, boolean z, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = l93Var;
            this.D = is4Var;
            this.E = is4Var2;
            this.F = aw2Var;
            this.G = joVar;
            this.H = z;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.C, this.D, this.E, this.F, this.G, this.H, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            ua0 ua0Var;
            CancellationException e;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                ua0 ua0Var2 = (ua0) this.B;
                try {
                    l93 l93Var = this.C;
                    C0067QnHx c0067QnHx = new C0067QnHx(ua0Var2, this.D, this.E, this.F, this.G, this.H, null);
                    this.B = ua0Var2;
                    this.A = 1;
                    if (l93Var.i0(c0067QnHx, this) == va0Var) {
                        return va0Var;
                    }
                } catch (CancellationException e2) {
                    ua0Var = ua0Var2;
                    e = e2;
                    if (!fp1.e0(ua0Var)) {
                        throw e;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ua0Var = (ua0) this.B;
                try {
                    C0239D.H(obj);
                } catch (CancellationException e3) {
                    e = e3;
                    if (!fp1.e0(ua0Var)) {
                        throw e;
                    }
                }
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public co0(boolean z, is4<? extends j81<? super d93, Boolean>> is4Var, is4<? extends h81<Boolean>> is4Var2, aw2 aw2Var, jo<an0> joVar, boolean z2, z80<? super co0> z80Var) {
        super(2, z80Var);
        this.C = z;
        this.D = is4Var;
        this.E = is4Var2;
        this.F = aw2Var;
        this.G = joVar;
        this.H = z2;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        co0 co0Var = new co0(this.C, this.D, this.E, this.F, this.G, this.H, z80Var);
        co0Var.B = obj;
        return co0Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            l93 l93Var = (l93) this.B;
            if (!this.C) {
                return sd5.a;
            }
            QnHx qnHx = new QnHx(l93Var, this.D, this.E, this.F, this.G, this.H, null);
            this.A = 1;
            if (fp1.R(qnHx, this) == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(l93 l93Var, z80<? super sd5> z80Var) {
        return ((co0) a(l93Var, z80Var)).i(sd5.a);
    }
}
