package androidx.media2.common;

import android.graphics.Bitmap;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapEntryParcelizer {
    public static MediaMetadata.BitmapEntry read(VersionedParcel versionedParcel) {
        MediaMetadata.BitmapEntry bitmapEntry = new MediaMetadata.BitmapEntry();
        bitmapEntry.a = versionedParcel.u(1, bitmapEntry.a);
        bitmapEntry.b = (Bitmap) versionedParcel.s(bitmapEntry.b, 2);
        return bitmapEntry;
    }

    public static void write(MediaMetadata.BitmapEntry bitmapEntry, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.N(1, bitmapEntry.a);
        versionedParcel.M(bitmapEntry.b, 2);
    }
}
