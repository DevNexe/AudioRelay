package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class StarRatingParcelizer {
    public static StarRating read(VersionedParcel versionedParcel) {
        StarRating starRating = new StarRating();
        starRating.a = versionedParcel.o(starRating.a, 1);
        float fM = starRating.b;
        if (versionedParcel.l(2)) {
            fM = versionedParcel.m();
        }
        starRating.b = fM;
        return starRating;
    }

    public static void write(StarRating starRating, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.I(starRating.a, 1);
        float f = starRating.b;
        versionedParcel.y(2);
        versionedParcel.G(f);
    }
}
