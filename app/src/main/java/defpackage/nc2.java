package defpackage;

import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nc2 {
    public static final HashMap a;

    static {
        HashMap map = new HashMap();
        a = new HashMap();
        map.put("android.media.metadata.ADVERTISEMENT", "androidx.media2.metadata.ADVERTISEMENT");
        map.put("android.media.metadata.BT_FOLDER_TYPE", "androidx.media2.metadata.BROWSABLE");
        map.put("android.media.metadata.DOWNLOAD_STATUS", "androidx.media2.metadata.DOWNLOAD_STATUS");
        for (Map.Entry entry : map.entrySet()) {
            HashMap map2 = a;
            if (map2.containsKey(entry.getValue())) {
                throw new RuntimeException("Shouldn't map to the same value");
            }
            map2.put((String) entry.getValue(), (String) entry.getKey());
        }
    }

    public static MediaItem a(MediaItem mediaItem) {
        MediaMetadata mediaMetadata;
        if (mediaItem == null || mediaItem.getClass() == MediaItem.class) {
            return mediaItem;
        }
        long j = mediaItem.c;
        long j2 = j < 0 ? 0L : j;
        long j3 = mediaItem.d;
        if (j3 < 0) {
            j3 = 576460752303423487L;
        }
        long j4 = j3;
        synchronized (mediaItem.a) {
            mediaMetadata = mediaItem.b;
        }
        return new MediaItem(mediaMetadata, j2, j4);
    }
}
