package androidx.media2.common;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class VideoSizeParcelizer {
    public static VideoSize read(VersionedParcel versionedParcel) {
        VideoSize videoSize = new VideoSize();
        videoSize.a = versionedParcel.o(videoSize.a, 1);
        videoSize.b = versionedParcel.o(videoSize.b, 2);
        return videoSize;
    }

    public static void write(VideoSize videoSize, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.I(videoSize.a, 1);
        versionedParcel.I(videoSize.b, 2);
    }
}
