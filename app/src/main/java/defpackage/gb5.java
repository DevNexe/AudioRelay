package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gb5 extends eb5 {
    public final /* synthetic */ int z;

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        switch (this.z) {
            case 0:
                int i = this.y + 2;
                this.y = i;
                return this.w[i - 2];
            default:
                int i2 = this.y + 2;
                this.y = i2;
                return this.w[i2 - 1];
        }
    }
}
