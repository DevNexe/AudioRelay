package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$4", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
public final class u64 extends px4 implements y81<ua0, Float, z80<? super sd5>, Object> {
    public /* synthetic */ float A;
    public final /* synthetic */ ri2<mm2> B;
    public final /* synthetic */ is4<z64> C;

    @if0(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$4$1", f = "Scrollable.kt", l = {258}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ is4<z64> B;
        public final /* synthetic */ float C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(is4<z64> is4Var, float f, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = is4Var;
            this.C = f;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, this.C, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                z64 value = this.B.getValue();
                this.A = 1;
                if (value.c(this.C, this) == va0Var) {
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
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u64(ri2<mm2> ri2Var, is4<z64> is4Var, z80<? super u64> z80Var) {
        super(3, z80Var);
        this.B = ri2Var;
        this.C = is4Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        fp1.k0(this.B.getValue().d(), null, 0, new QnHx(this.C, this.A, null), 3);
        return sd5.a;
    }

    @Override // defpackage.y81
    public final Object invoke(ua0 ua0Var, Float f, z80<? super sd5> z80Var) {
        float fFloatValue = f.floatValue();
        u64 u64Var = new u64(this.B, this.C, z80Var);
        u64Var.A = fFloatValue;
        return u64Var.i(sd5.a);
    }
}
