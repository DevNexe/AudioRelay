package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", f = "Draggable.kt", l = {237, 239, 241, 251, 253, 257}, m = "invokeSuspend")
public final class bo0 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public jl3 A;
    public jl3 B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ jo<an0> E;
    public final /* synthetic */ x83 F;
    public final /* synthetic */ is4<pn0> G;

    @if0(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", f = "Draggable.kt", l = {246}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<w83, z80<? super sd5>, Object> {
        public jl3 A;
        public int B;
        public /* synthetic */ Object C;
        public final /* synthetic */ jl3<an0> D;
        public final /* synthetic */ jo<an0> E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(jl3<an0> jl3Var, jo<an0> joVar, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.D = jl3Var;
            this.E = joVar;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.D, this.E, z80Var);
            qnHx.C = obj;
            return qnHx;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0054 -> B:23:0x005a). Please report as a decompilation issue!!! */
        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            w83 w83Var;
            QnHx qnHx;
            an0 an0Var;
            QnHx qnHx2;
            T t;
            w83 w83Var2;
            jl3<an0> jl3Var;
            va0 va0Var;
            va0 va0Var2 = va0.COROUTINE_SUSPENDED;
            int i = this.B;
            if (i == 0) {
                C0239D.H(obj);
                w83Var = (w83) this.C;
                qnHx = this;
                jl3<an0> jl3Var2 = qnHx.D;
                an0Var = jl3Var2.w;
                if (!(an0Var instanceof an0.LPt8Fixed) || (an0Var instanceof an0.QnHx)) {
                    return sd5.a;
                }
                an0.CQf cQf = an0Var instanceof an0.CQf ? (an0.CQf) an0Var : null;
                if (cQf != null) {
                    w83Var.a(cQf.b, cQf.a);
                }
                qnHx.C = w83Var;
                qnHx.A = jl3Var2;
                qnHx.B = 1;
                Object objE = qnHx.E.E(qnHx);
                if (objE == va0Var2) {
                    return va0Var2;
                }
                va0 va0Var3 = va0Var2;
                qnHx2 = qnHx;
                t = objE;
                w83Var2 = w83Var;
                jl3Var = jl3Var2;
                va0Var = va0Var3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jl3<an0> jl3Var3 = this.A;
                w83 w83Var3 = (w83) this.C;
                C0239D.H(obj);
                w83Var2 = w83Var3;
                jl3Var = jl3Var3;
                va0Var = va0Var2;
                qnHx2 = this;
                t = obj;
            }
            jl3Var.w = t;
            qnHx = qnHx2;
            va0Var2 = va0Var;
            w83Var = w83Var2;
            jl3<an0> jl3Var4 = qnHx.D;
            an0Var = jl3Var4.w;
            if (an0Var instanceof an0.LPt8Fixed) {
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(w83 w83Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(w83Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo0(jo<an0> joVar, x83 x83Var, is4<pn0> is4Var, z80<? super bo0> z80Var) {
        super(2, z80Var);
        this.E = joVar;
        this.F = x83Var;
        this.G = is4Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        bo0 bo0Var = new bo0(this.E, this.F, this.G, z80Var);
        bo0Var.D = obj;
        return bo0Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd A[Catch: CancellationException -> 0x00f2, TryCatch #1 {CancellationException -> 0x00f2, blocks: (B:36:0x00bf, B:38:0x00cd, B:41:0x00dd, B:43:0x00e1), top: B:57:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd A[Catch: CancellationException -> 0x00f2, TryCatch #1 {CancellationException -> 0x00f2, blocks: (B:36:0x00bf, B:38:0x00cd, B:41:0x00dd, B:43:0x00e1), top: B:57:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1 A[Catch: CancellationException -> 0x00f2, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x00f2, blocks: (B:36:0x00bf, B:38:0x00cd, B:41:0x00dd, B:43:0x00e1), top: B:57:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00da -> B:20:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00df -> B:20:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ec -> B:20:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0105 -> B:20:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0108 -> B:20:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.m8
    public final java.lang.Object i(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo0.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((bo0) a(ua0Var, z80Var)).i(sd5.a);
    }
}
