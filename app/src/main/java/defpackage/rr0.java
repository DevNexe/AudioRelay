package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rr0 implements pj1 {
    public final boolean w;

    public rr0(boolean z) {
        this.w = z;
    }

    @Override // defpackage.pj1
    public final boolean c() {
        return this.w;
    }

    @Override // defpackage.pj1
    public final vo2 f() {
        return null;
    }

    public final String toString() {
        return bl2.c(new StringBuilder("Empty{"), this.w ? "Active" : "New", '}');
    }
}
