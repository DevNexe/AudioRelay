package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t6r8 extends VQko {
    public final A$Y4 e;
    public final Sb1 f;
    public final int g;
    public final ad0 h;
    public final q1 i;
    public final l1 j;
    public final kv2 k;

    public t6r8(A$Y4 a$y4, Sb1 sb1, int i, ad0 ad0Var, q1 q1Var, l1 l1Var, kv2 kv2Var) {
        this.e = a$y4;
        this.f = sb1;
        this.g = i;
        this.h = ad0Var;
        this.i = q1Var;
        this.j = l1Var;
        this.k = kv2Var;
    }

    @Override // defpackage.VQko
    public final Sb1 a() {
        return this.f;
    }

    @Override // defpackage.VQko
    public final int b() {
        return this.g;
    }

    @Override // defpackage.VQko
    public final ad0 c() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6r8)) {
            return false;
        }
        t6r8 t6r8Var = (t6r8) obj;
        return this.e == t6r8Var.e && ur1.a(this.f, t6r8Var.f) && this.g == t6r8Var.g && ur1.a(this.h, t6r8Var.h) && ur1.a(this.i, t6r8Var.i) && ur1.a(this.j, t6r8Var.j) && this.k == t6r8Var.k;
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((((this.f.hashCode() + (this.e.hashCode() * 31)) * 31) + this.g) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AndroidAudioOutputConfig(audioOutputType=" + this.e + ", audioConfig=" + this.f + ", bufferSizeInBytes=" + this.g + ", bufferSizes=" + this.h + ", audioTrackOptions=" + this.i + ", audioTrackBufferConfig=" + this.j + ", openSLPerformanceMode=" + this.k + ")";
    }
}
