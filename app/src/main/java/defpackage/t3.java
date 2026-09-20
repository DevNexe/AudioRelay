package defpackage;

import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes3.dex */
public final class t3 extends o22 {
    public final String a;
    public final String b;

    public t3(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    @Override // defpackage.o22
    @Nonnull
    public final String a() {
        return this.a;
    }

    @Override // defpackage.o22
    @Nonnull
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o22)) {
            return false;
        }
        o22 o22Var = (o22) obj;
        return this.a.equals(o22Var.a()) && this.b.equals(o22Var.b());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return i5.b(sb, this.b, "}");
    }
}
