package androidx.media2.session;

import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackInfoParcelizer {
    public static MediaController$PlaybackInfo read(VersionedParcel versionedParcel) {
        MediaController$PlaybackInfo mediaController$PlaybackInfo = new MediaController$PlaybackInfo();
        mediaController$PlaybackInfo.a = versionedParcel.o(mediaController$PlaybackInfo.a, 1);
        mediaController$PlaybackInfo.b = versionedParcel.o(mediaController$PlaybackInfo.b, 2);
        mediaController$PlaybackInfo.c = versionedParcel.o(mediaController$PlaybackInfo.c, 3);
        mediaController$PlaybackInfo.d = versionedParcel.o(mediaController$PlaybackInfo.d, 4);
        mediaController$PlaybackInfo.e = (AudioAttributesCompat) versionedParcel.x(mediaController$PlaybackInfo.e, 5);
        return mediaController$PlaybackInfo;
    }

    public static void write(MediaController$PlaybackInfo mediaController$PlaybackInfo, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.I(mediaController$PlaybackInfo.a, 1);
        versionedParcel.I(mediaController$PlaybackInfo.b, 2);
        versionedParcel.I(mediaController$PlaybackInfo.c, 3);
        versionedParcel.I(mediaController$PlaybackInfo.d, 4);
        versionedParcel.R(mediaController$PlaybackInfo.e, 5);
    }
}
