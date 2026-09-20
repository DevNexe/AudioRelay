package androidx.media2.common;

import defpackage.sh5;

/* JADX INFO: loaded from: classes.dex */
public class VideoSize implements sh5 {
    public int a;
    public int b;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSize)) {
            return false;
        }
        VideoSize videoSize = (VideoSize) obj;
        return this.a == videoSize.a && this.b == videoSize.b;
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = this.a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
