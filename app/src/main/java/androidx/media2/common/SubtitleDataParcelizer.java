package androidx.media2.common;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleDataParcelizer {
    public static SubtitleData read(VersionedParcel versionedParcel) {
        SubtitleData subtitleData = new SubtitleData();
        subtitleData.a = versionedParcel.q(1, subtitleData.a);
        subtitleData.b = versionedParcel.q(2, subtitleData.b);
        byte[] bArrI = subtitleData.c;
        if (versionedParcel.l(3)) {
            bArrI = versionedParcel.i();
        }
        subtitleData.c = bArrI;
        return subtitleData;
    }

    public static void write(SubtitleData subtitleData, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.J(1, subtitleData.a);
        versionedParcel.J(2, subtitleData.b);
        byte[] bArr = subtitleData.c;
        versionedParcel.y(3);
        versionedParcel.D(bArr);
    }
}
