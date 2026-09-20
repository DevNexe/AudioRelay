package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jk extends lk.QnHx {
    public int w = 0;
    public final int x;
    public final /* synthetic */ lk y;

    public jk(lk lkVar) {
        this.y = lkVar;
        this.x = lkVar.size();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.w < this.x;
    }
}
