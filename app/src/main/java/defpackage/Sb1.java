package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Sb1 {
    public static final Sb1 d = new Sb1(48000, 16, 2);
    public final int a;
    public final int b;
    public final int c;

    public Sb1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sb1)) {
            return false;
        }
        Sb1 sb1 = (Sb1) obj;
        return this.a == sb1.a && this.b == sb1.b && this.c == sb1.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioConfig(sampleRate=");
        sb.append(this.a);
        sb.append(", bits=");
        sb.append(this.b);
        sb.append(", channels=");
        return ex0.c(sb, this.c, ")");
    }
}
