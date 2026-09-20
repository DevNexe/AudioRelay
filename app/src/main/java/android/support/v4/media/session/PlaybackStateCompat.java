package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.hc2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new QnHx();
    public final long A;
    public final int B;
    public final CharSequence C;
    public final long D;
    public final ArrayList E;
    public final long F;
    public final Bundle G;
    public PlaybackState H;
    public final int w;
    public final long x;
    public final long y;
    public final float z;

    public static class CQf {
        public static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        public static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        public static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        public static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        public static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        public static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        public static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        public static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        public static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        public static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        public static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        public static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        public static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        public static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        public static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        public static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        public static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        public static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        public static void s(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        public static void t(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        public static void u(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        public static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        public static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }
    }

    public static class F1 {
        public static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        public static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    public class QnHx implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.w = i;
        this.x = j;
        this.y = j2;
        this.z = f;
        this.A = j3;
        this.B = i2;
        this.C = charSequence;
        this.D = j4;
        this.E = new ArrayList(arrayList);
        this.F = j5;
        this.G = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.w);
        sb.append(", position=");
        sb.append(this.x);
        sb.append(", buffered position=");
        sb.append(this.y);
        sb.append(", speed=");
        sb.append(this.z);
        sb.append(", updated=");
        sb.append(this.D);
        sb.append(", actions=");
        sb.append(this.A);
        sb.append(", error code=");
        sb.append(this.B);
        sb.append(", error message=");
        sb.append(this.C);
        sb.append(", custom actions=");
        sb.append(this.E);
        sb.append(", active item id=");
        return hc2.a(sb, this.F, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.w);
        parcel.writeLong(this.x);
        parcel.writeFloat(this.z);
        parcel.writeLong(this.D);
        parcel.writeLong(this.y);
        parcel.writeLong(this.A);
        TextUtils.writeToParcel(this.C, parcel, i);
        parcel.writeTypedList(this.E);
        parcel.writeLong(this.F);
        parcel.writeBundle(this.G);
        parcel.writeInt(this.B);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new QnHx();
        public PlaybackState.CustomAction A;
        public final String w;
        public final CharSequence x;
        public final int y;
        public final Bundle z;

        public class QnHx implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.w = str;
            this.x = charSequence;
            this.y = i;
            this.z = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.x) + ", mIcon=" + this.y + ", mExtras=" + this.z;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.w);
            TextUtils.writeToParcel(this.x, parcel, i);
            parcel.writeInt(this.y);
            parcel.writeBundle(this.z);
        }

        public CustomAction(Parcel parcel) {
            this.w = parcel.readString();
            this.x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.y = parcel.readInt();
            this.z = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.w = parcel.readInt();
        this.x = parcel.readLong();
        this.z = parcel.readFloat();
        this.D = parcel.readLong();
        this.y = parcel.readLong();
        this.A = parcel.readLong();
        this.C = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.E = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.F = parcel.readLong();
        this.G = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.B = parcel.readInt();
    }
}
