package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class HeartRatingParcelizer {
    public static HeartRating read(VersionedParcel versionedParcel) {
        HeartRating heartRating = new HeartRating();
        heartRating.a = versionedParcel.f(1, heartRating.a);
        heartRating.b = versionedParcel.f(2, heartRating.b);
        return heartRating;
    }

    public static void write(HeartRating heartRating, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.z(1, heartRating.a);
        versionedParcel.z(2, heartRating.b);
    }
}
