package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class CommandButtonParcelizer {
    public static MediaSession$CommandButton read(VersionedParcel versionedParcel) {
        MediaSession$CommandButton mediaSession$CommandButton = new MediaSession$CommandButton();
        mediaSession$CommandButton.a = (SessionCommand) versionedParcel.x(mediaSession$CommandButton.a, 1);
        mediaSession$CommandButton.b = versionedParcel.o(mediaSession$CommandButton.b, 2);
        CharSequence charSequenceJ = mediaSession$CommandButton.c;
        if (versionedParcel.l(3)) {
            charSequenceJ = versionedParcel.j();
        }
        mediaSession$CommandButton.c = charSequenceJ;
        mediaSession$CommandButton.d = versionedParcel.h(4, mediaSession$CommandButton.d);
        mediaSession$CommandButton.e = versionedParcel.f(5, mediaSession$CommandButton.e);
        return mediaSession$CommandButton;
    }

    public static void write(MediaSession$CommandButton mediaSession$CommandButton, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.R(mediaSession$CommandButton.a, 1);
        versionedParcel.I(mediaSession$CommandButton.b, 2);
        CharSequence charSequence = mediaSession$CommandButton.c;
        versionedParcel.y(3);
        versionedParcel.E(charSequence);
        versionedParcel.B(4, mediaSession$CommandButton.d);
        versionedParcel.z(5, mediaSession$CommandButton.e);
    }
}
