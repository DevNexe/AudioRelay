package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new QnHx();
    public final int w;
    public final float x;
    public Object y;

    public static class CQf {
        public static float a(Rating rating) {
            return rating.getPercentRating();
        }

        public static int b(Rating rating) {
            return rating.getRatingStyle();
        }

        public static float c(Rating rating) {
            return rating.getStarRating();
        }

        public static boolean d(Rating rating) {
            return rating.hasHeart();
        }

        public static boolean e(Rating rating) {
            return rating.isRated();
        }

        public static boolean f(Rating rating) {
            return rating.isThumbUp();
        }

        public static Rating g(boolean z) {
            return Rating.newHeartRating(z);
        }

        public static Rating h(float f) {
            return Rating.newPercentageRating(f);
        }

        public static Rating i(int i, float f) {
            return Rating.newStarRating(i, f);
        }

        public static Rating j(boolean z) {
            return Rating.newThumbRating(z);
        }

        public static Rating k(int i) {
            return Rating.newUnratedRating(i);
        }
    }

    public class QnHx implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f) {
        this.w = i;
        this.x = f;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat;
        float f;
        RatingCompat ratingCompat2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int iB = CQf.b(rating);
            if (!CQf.e(rating)) {
                switch (iB) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat2 = new RatingCompat(iB, -1.0f);
                        break;
                }
            } else {
                switch (iB) {
                    case 1:
                        ratingCompat = new RatingCompat(1, CQf.d(rating) ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, CQf.f(rating) ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float fC = CQf.c(rating);
                        if (iB == 3) {
                            f = 3.0f;
                        } else if (iB == 4) {
                            f = 4.0f;
                        } else if (iB != 5) {
                            Log.e("Rating", "Invalid rating style (" + iB + ") for a star rating");
                        } else {
                            f = 5.0f;
                        }
                        if (fC >= 0.0f && fC <= f) {
                            ratingCompat2 = new RatingCompat(iB, fC);
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                        }
                        break;
                    case 6:
                        float fA = CQf.a(rating);
                        if (fA >= 0.0f && fA <= 100.0f) {
                            ratingCompat2 = new RatingCompat(6, fA);
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                        }
                        break;
                    default:
                        return null;
                }
            }
            ratingCompat2.y = obj;
        }
        return ratingCompat2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.w;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.w);
        sb.append(" rating=");
        float f = this.x;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.w);
        parcel.writeFloat(this.x);
    }
}
