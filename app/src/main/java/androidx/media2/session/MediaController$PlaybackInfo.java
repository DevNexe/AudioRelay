package androidx.media2.session;

import androidx.media.AudioAttributesCompat;
import defpackage.sh5;
import defpackage.uq2;

/* JADX INFO: loaded from: classes.dex */
public final class MediaController$PlaybackInfo implements sh5 {
    public int a;
    public int b;
    public int c;
    public int d;
    public AudioAttributesCompat e;

    public final boolean equals(Object obj) {
        if (!(obj instanceof MediaController$PlaybackInfo)) {
            return false;
        }
        MediaController$PlaybackInfo mediaController$PlaybackInfo = (MediaController$PlaybackInfo) obj;
        return this.a == mediaController$PlaybackInfo.a && this.b == mediaController$PlaybackInfo.b && this.c == mediaController$PlaybackInfo.c && this.d == mediaController$PlaybackInfo.d && uq2.a(this.e, mediaController$PlaybackInfo.e);
    }

    public final int hashCode() {
        return uq2.b(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e);
    }
}
