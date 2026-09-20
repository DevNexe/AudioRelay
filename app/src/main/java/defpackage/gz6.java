package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gz6 extends jz6 {
    public int w = 0;
    public final int x;
    public final /* synthetic */ a07 y;

    public gz6(a07 a07Var) {
        this.y = a07Var;
        this.x = a07Var.c();
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final boolean hasNext() {
        return this.w < this.x;
    }
}
