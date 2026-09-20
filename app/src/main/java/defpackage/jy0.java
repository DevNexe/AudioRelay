package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jy0 implements iy0 {
    public final String a;
    public final int b;

    public jy0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.iy0
    public final long a() {
        if (this.b == 0) {
            return 0L;
        }
        String strTrim = c().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strTrim, "long"), e);
        }
    }

    @Override // defpackage.iy0
    public final double b() {
        if (this.b == 0) {
            return 0.0d;
        }
        String strTrim = c().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strTrim, "double"), e);
        }
    }

    @Override // defpackage.iy0
    public final String c() {
        if (this.b == 0) {
            return "";
        }
        String str = this.a;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }

    @Override // defpackage.iy0
    public final int d() {
        return this.b;
    }

    @Override // defpackage.iy0
    public final boolean e() {
        if (this.b == 0) {
            return false;
        }
        String strTrim = c().trim();
        if (j50.e.matcher(strTrim).matches()) {
            return true;
        }
        if (j50.f.matcher(strTrim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strTrim, "boolean"));
    }
}
