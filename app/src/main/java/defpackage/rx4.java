package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {597}, m = "withTimeoutOrNull")
public final class rx4<T> extends b90 {
    public final /* synthetic */ qx4.QnHx<Object> A;
    public int B;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx4(qx4.QnHx<Object> qnHx, z80<? super rx4> z80Var) {
        super(z80Var);
        this.A = qnHx;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.X(0L, null, this);
    }
}
