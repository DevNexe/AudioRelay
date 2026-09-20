package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m95 {
    public static final long b = (((long) Float.floatToIntBits(0.5f)) << 32) | (((long) Float.floatToIntBits(0.5f)) & 4294967295L);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ m95(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String b(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m95) {
            return this.a == ((m95) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return b(this.a);
    }
}
