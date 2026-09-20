package androidx.media2.common;

import defpackage.sh5;
import defpackage.uq2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleData implements sh5 {
    public long a;
    public long b;
    public byte[] c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SubtitleData.class != obj.getClass()) {
            return false;
        }
        SubtitleData subtitleData = (SubtitleData) obj;
        return this.a == subtitleData.a && this.b == subtitleData.b && Arrays.equals(this.c, subtitleData.c);
    }

    public final int hashCode() {
        return uq2.b(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c)));
    }
}
