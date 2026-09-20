package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class zg2 implements Comparable<zg2>, Parcelable {
    public static final Parcelable.Creator<zg2> CREATOR = new QnHx();
    public final int A;
    public final long B;
    public String C;
    public final Calendar w;
    public final int x;
    public final int y;
    public final int z;

    public static class QnHx implements Parcelable.Creator<zg2> {
        @Override // android.os.Parcelable.Creator
        public final zg2 createFromParcel(Parcel parcel) {
            return zg2.a(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final zg2[] newArray(int i) {
            return new zg2[i];
        }
    }

    public zg2(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarB = lf5.b(calendar);
        this.w = calendarB;
        this.x = calendarB.get(2);
        this.y = calendarB.get(1);
        this.z = calendarB.getMaximum(7);
        this.A = calendarB.getActualMaximum(5);
        this.B = calendarB.getTimeInMillis();
    }

    public static zg2 a(int i, int i2) {
        Calendar calendarD = lf5.d(null);
        calendarD.set(1, i);
        calendarD.set(2, i2);
        return new zg2(calendarD);
    }

    public static zg2 l(long j) {
        Calendar calendarD = lf5.d(null);
        calendarD.setTimeInMillis(j);
        return new zg2(calendarD);
    }

    @Override // java.lang.Comparable
    public final int compareTo(zg2 zg2Var) {
        return this.w.compareTo(zg2Var.w);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg2)) {
            return false;
        }
        zg2 zg2Var = (zg2) obj;
        return this.x == zg2Var.x && this.y == zg2Var.y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.x), Integer.valueOf(this.y)});
    }

    public final int n() {
        Calendar calendar = this.w;
        int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.z : firstDayOfWeek;
    }

    public final String o(Context context) {
        if (this.C == null) {
            long timeInMillis = this.w.getTimeInMillis();
            this.C = DateUtils.formatDateTime(context, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36);
        }
        return this.C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.y);
        parcel.writeInt(this.x);
    }
}
