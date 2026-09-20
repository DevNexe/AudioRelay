package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n53 {
    public static final n53 b = new n53();
    public final boolean a;

    public n53(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n53) {
            return this.a == ((n53) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return dj.c(new StringBuilder("PlatformParagraphStyle(includeFontPadding="), this.a, ')');
    }

    public n53() {
        this(true);
    }
}
