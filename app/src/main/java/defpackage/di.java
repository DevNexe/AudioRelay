package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class di {
    public final Sb1 a;
    public final int b;
    public final int c;
    public final int d = 2;
    public final int e;
    public final int f;
    public final int g;

    public di(Sb1 sb1, int i, int i2, int i3, int i4, int i5) {
        this.a = sb1;
        this.b = i;
        this.c = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di)) {
            return false;
        }
        di diVar = (di) obj;
        return ur1.a(this.a, diVar.a) && this.b == diVar.b && this.c == diVar.c && this.d == diVar.d && this.e == diVar.e && this.f == diVar.f && this.g == diVar.g;
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioCaptureConfig(audioConfig=");
        sb.append(this.a);
        sb.append(", sampleRate=");
        sb.append(this.b);
        sb.append(", channelFormat=");
        sb.append(this.c);
        sb.append(", encodingFormat=");
        sb.append(this.d);
        sb.append(", lowLatencyBufferSize=");
        sb.append(this.e);
        sb.append(", smoothPlaybackBufferSize=");
        sb.append(this.f);
        sb.append(", micAudioSource=");
        return ex0.c(sb, this.g, ")");
    }
}
