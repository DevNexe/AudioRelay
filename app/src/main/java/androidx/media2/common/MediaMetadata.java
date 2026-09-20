package androidx.media2.common;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.Bt7j;
import defpackage.a42;
import defpackage.sh5;
import defpackage.wa;

/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadata extends CustomVersionedParcelable {
    public Bundle a;
    public Bundle b;
    public ParcelImplListSlice c;

    public static final class BitmapEntry implements sh5 {
        public String a;
        public Bitmap b;

        public BitmapEntry() {
        }

        public BitmapEntry(String str, Bitmap bitmap) {
            this.a = str;
            this.b = bitmap;
            int iA = wa.a(bitmap);
            if (iA > 262144) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                double dSqrt = Math.sqrt(262144.0d / ((double) iA));
                int i = (int) (((double) width) * dSqrt);
                int i2 = (int) (((double) height) * dSqrt);
                StringBuilder sbA = a42.a("Scaling large bitmap of ", width, "x", height, " into ");
                sbA.append(i);
                sbA.append("x");
                sbA.append(i2);
                Log.i("MediaMetadata", sbA.toString());
                this.b = Bitmap.createScaledBitmap(bitmap, i, i2, true);
            }
        }
    }

    static {
        Bt7j bt7j = new Bt7j();
        bt7j.put("android.media.metadata.TITLE", 1);
        bt7j.put("android.media.metadata.ARTIST", 1);
        bt7j.put("android.media.metadata.DURATION", 0);
        bt7j.put("android.media.metadata.ALBUM", 1);
        bt7j.put("android.media.metadata.AUTHOR", 1);
        bt7j.put("android.media.metadata.WRITER", 1);
        bt7j.put("android.media.metadata.COMPOSER", 1);
        bt7j.put("android.media.metadata.COMPILATION", 1);
        bt7j.put("android.media.metadata.DATE", 1);
        bt7j.put("android.media.metadata.YEAR", 0);
        bt7j.put("android.media.metadata.GENRE", 1);
        bt7j.put("android.media.metadata.TRACK_NUMBER", 0);
        bt7j.put("android.media.metadata.NUM_TRACKS", 0);
        bt7j.put("android.media.metadata.DISC_NUMBER", 0);
        bt7j.put("android.media.metadata.ALBUM_ARTIST", 1);
        bt7j.put("android.media.metadata.ART", 2);
        bt7j.put("android.media.metadata.ART_URI", 1);
        bt7j.put("android.media.metadata.ALBUM_ART", 2);
        bt7j.put("android.media.metadata.ALBUM_ART_URI", 1);
        bt7j.put("android.media.metadata.USER_RATING", 3);
        bt7j.put("android.media.metadata.RATING", 3);
        bt7j.put("android.media.metadata.DISPLAY_TITLE", 1);
        bt7j.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        bt7j.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        bt7j.put("android.media.metadata.DISPLAY_ICON", 2);
        bt7j.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        bt7j.put("android.media.metadata.MEDIA_ID", 1);
        bt7j.put("android.media.metadata.MEDIA_URI", 1);
        bt7j.put("androidx.media2.metadata.RADIO_FREQUENCY", 4);
        bt7j.put("androidx.media2.metadata.RADIO_PROGRAM_NAME", 1);
        bt7j.put("androidx.media2.metadata.BROWSABLE", 0);
        bt7j.put("androidx.media2.metadata.PLAYABLE", 0);
        bt7j.put("androidx.media2.metadata.ADVERTISEMENT", 0);
        bt7j.put("androidx.media2.metadata.DOWNLOAD_STATUS", 0);
        bt7j.put("androidx.media2.metadata.EXTRAS", 5);
    }

    public final String toString() {
        return this.a.toString();
    }
}
