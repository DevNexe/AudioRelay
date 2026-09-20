package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p3 extends nu0 {
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;

    public p3(long j, int i, int i2, long j2, int i3) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }

    @Override // defpackage.nu0
    public final int a() {
        return this.d;
    }

    @Override // defpackage.nu0
    public final long b() {
        return this.e;
    }

    @Override // defpackage.nu0
    public final int c() {
        return this.c;
    }

    @Override // defpackage.nu0
    public final int d() {
        return this.f;
    }

    @Override // defpackage.nu0
    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nu0)) {
            return false;
        }
        nu0 nu0Var = (nu0) obj;
        return this.b == nu0Var.e() && this.c == nu0Var.c() && this.d == nu0Var.a() && this.e == nu0Var.b() && this.f == nu0Var.d();
    }

    public final int hashCode() {
        long j = this.b;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j2 = this.e;
        return this.f ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.b);
        sb.append(", loadBatchSize=");
        sb.append(this.c);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.d);
        sb.append(", eventCleanUpAge=");
        sb.append(this.e);
        sb.append(", maxBlobByteSizePerRow=");
        return ex0.c(sb, this.f, "}");
    }
}
