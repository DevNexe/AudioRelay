package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class q2 extends gc0 {
    public final bc0 a;
    public final String b;
    public final File c;

    public q2(p2 p2Var, String str, File file) {
        this.a = p2Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.b = str;
        this.c = file;
    }

    @Override // defpackage.gc0
    public final bc0 a() {
        return this.a;
    }

    @Override // defpackage.gc0
    public final File b() {
        return this.c;
    }

    @Override // defpackage.gc0
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gc0)) {
            return false;
        }
        gc0 gc0Var = (gc0) obj;
        return this.a.equals(gc0Var.a()) && this.b.equals(gc0Var.c()) && this.c.equals(gc0Var.b());
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
