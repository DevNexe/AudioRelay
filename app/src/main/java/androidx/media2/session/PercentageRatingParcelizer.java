package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class PercentageRatingParcelizer {
    public static PercentageRating read(VersionedParcel versionedParcel) {
        PercentageRating percentageRating = new PercentageRating();
        float fM = percentageRating.a;
        if (versionedParcel.l(1)) {
            fM = versionedParcel.m();
        }
        percentageRating.a = fM;
        return percentageRating;
    }

    public static void write(PercentageRating percentageRating, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        float f = percentageRating.a;
        versionedParcel.y(1);
        versionedParcel.G(f);
    }
}
