package androidx.media2.common;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class MediaItemParcelizer {
    public static MediaItem read(VersionedParcel versionedParcel) {
        MediaItem mediaItem = new MediaItem();
        mediaItem.b = (MediaMetadata) versionedParcel.x(mediaItem.b, 1);
        mediaItem.c = versionedParcel.q(2, mediaItem.c);
        mediaItem.d = versionedParcel.q(3, mediaItem.d);
        return mediaItem;
    }

    public static void write(MediaItem mediaItem, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        if (mediaItem.getClass() != MediaItem.class) {
            throw new RuntimeException("MediaItem's subclasses shouldn't be parcelized.");
        }
        versionedParcel.R(mediaItem.b, 1);
        versionedParcel.J(2, mediaItem.c);
        versionedParcel.J(3, mediaItem.d);
    }
}
