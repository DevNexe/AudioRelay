package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class ThumbRatingParcelizer {
    public static ThumbRating read(VersionedParcel versionedParcel) {
        ThumbRating thumbRating = new ThumbRating();
        thumbRating.a = versionedParcel.f(1, thumbRating.a);
        thumbRating.b = versionedParcel.f(2, thumbRating.b);
        return thumbRating;
    }

    public static void write(ThumbRating thumbRating, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.z(1, thumbRating.a);
        versionedParcel.z(2, thumbRating.b);
    }
}
