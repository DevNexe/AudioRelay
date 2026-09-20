package androidx.media2.common;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.versionedparcelable.ParcelImpl;
import androidx.versionedparcelable.VersionedParcel;
import defpackage.jz2;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataParcelizer {
    public static MediaMetadata read(VersionedParcel versionedParcel) {
        MediaMetadata mediaMetadata = new MediaMetadata();
        mediaMetadata.b = versionedParcel.h(1, mediaMetadata.b);
        mediaMetadata.c = (ParcelImplListSlice) versionedParcel.s(mediaMetadata.c, 2);
        Bundle bundle = mediaMetadata.b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        mediaMetadata.a = bundle;
        ParcelImplListSlice parcelImplListSlice = mediaMetadata.c;
        if (parcelImplListSlice != null) {
            Iterator<ParcelImpl> it = parcelImplListSlice.w.iterator();
            while (it.hasNext()) {
                MediaMetadata.BitmapEntry bitmapEntry = (MediaMetadata.BitmapEntry) jz2.a(it.next());
                mediaMetadata.a.putParcelable(bitmapEntry.a, bitmapEntry.b);
            }
        }
        return mediaMetadata;
    }

    public static void write(MediaMetadata mediaMetadata, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        synchronized (mediaMetadata.a) {
            try {
                if (mediaMetadata.b == null) {
                    mediaMetadata.b = new Bundle(mediaMetadata.a);
                    ArrayList arrayList = new ArrayList();
                    for (String str : mediaMetadata.a.keySet()) {
                        Object obj = mediaMetadata.a.get(str);
                        if (obj instanceof Bitmap) {
                            arrayList.add(MediaParcelUtils.a(new MediaMetadata.BitmapEntry(str, (Bitmap) obj)));
                            mediaMetadata.b.remove(str);
                        }
                    }
                    mediaMetadata.c = new ParcelImplListSlice(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        versionedParcel.B(1, mediaMetadata.b);
        versionedParcel.M(mediaMetadata.c, 2);
    }
}
