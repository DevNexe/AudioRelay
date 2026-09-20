package androidx.media2.common;

import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.qc0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MediaItem extends CustomVersionedParcelable {
    public final Object a;
    public MediaMetadata b;
    public long c;
    public long d;

    public MediaItem() {
        this.a = new Object();
        this.c = 0L;
        this.d = 576460752303423487L;
        new ArrayList();
    }

    public final String toString() {
        String string;
        CharSequence charSequence;
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        synchronized (this.a) {
            sb.append("{Media Id=");
            synchronized (this.a) {
                MediaMetadata mediaMetadata = this.b;
                string = (mediaMetadata == null || (charSequence = mediaMetadata.a.getCharSequence("android.media.metadata.MEDIA_ID")) == null) ? null : charSequence.toString();
            }
            sb.append(string);
            sb.append(", mMetadata=");
            sb.append(this.b);
            sb.append(", mStartPositionMs=");
            sb.append(this.c);
            sb.append(", mEndPositionMs=");
            sb.append(this.d);
            sb.append('}');
        }
        return sb.toString();
    }

    public MediaItem(MediaMetadata mediaMetadata, long j, long j2) {
        this.a = new Object();
        this.c = 0L;
        this.d = 576460752303423487L;
        new ArrayList();
        if (j <= j2) {
            if (mediaMetadata != null && mediaMetadata.a.containsKey("android.media.metadata.DURATION")) {
                long j3 = mediaMetadata.a.getLong("android.media.metadata.DURATION", 0L);
                if (j3 != Long.MIN_VALUE && j2 != 576460752303423487L && j2 > j3) {
                    StringBuilder sbB = qc0.b("endPositionMs shouldn't be greater than duration in the metdata, endPositionMs=", j2, ", durationMs=");
                    sbB.append(j3);
                    throw new IllegalStateException(sbB.toString());
                }
            }
            this.b = mediaMetadata;
            this.c = j;
            this.d = j2;
            return;
        }
        StringBuilder sbB2 = qc0.b("Illegal start/end position: ", j, " : ");
        sbB2.append(j2);
        throw new IllegalStateException(sbB2.toString());
    }
}
