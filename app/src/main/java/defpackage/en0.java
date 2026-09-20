package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {755}, m = "invokeSuspend")
public final class en0 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ l93 B;
    public final /* synthetic */ jl3<d93> C;
    public final /* synthetic */ jl3<d93> D;

    @if0(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1", f = "DragGestureDetector.kt", l = {758, 775}, m = "invokeSuspend")
    public static final class QnHx extends eq3 implements x81<a5, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ jl3<d93> C;
        public final /* synthetic */ jl3<d93> D;
        public y83 y;
        public int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(jl3<d93> jl3Var, jl3<d93> jl3Var2, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = jl3Var;
            this.D = jl3Var2;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.C, this.D, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0062  */
        /* JADX WARN: Code duplicated, block: B:21:0x0070 A[LOOP:2: B:17:0x0060->B:21:0x0070, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:81:0x0073 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x006e A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v11, types: [T, d93] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00bb -> B:44:0x00bd). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.m8
        public final java.lang.Object i(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 320
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: en0.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(a5 a5Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(a5Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en0(l93 l93Var, jl3<d93> jl3Var, jl3<d93> jl3Var2, z80<? super en0> z80Var) {
        super(2, z80Var);
        this.B = l93Var;
        this.C = jl3Var;
        this.D = jl3Var2;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new en0(this.B, this.C, this.D, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            QnHx qnHx = new QnHx(this.C, this.D, null);
            this.A = 1;
            if (this.B.i0(qnHx, this) == va0Var) {
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
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((en0) a(ua0Var, z80Var)).i(sd5.a);
    }
}
