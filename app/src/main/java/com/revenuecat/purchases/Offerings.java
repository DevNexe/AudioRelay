package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ur1;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Offerings implements Parcelable {
    public static final Parcelable.Creator<Offerings> CREATOR = new Creator();
    private final Map<String, Offering> all;
    private final Offering current;

    public static final class Creator implements Parcelable.Creator<Offerings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Offerings createFromParcel(Parcel parcel) {
            Offering offeringCreateFromParcel = parcel.readInt() == 0 ? null : Offering.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), Offering.CREATOR.createFromParcel(parcel));
            }
            return new Offerings(offeringCreateFromParcel, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Offerings[] newArray(int i) {
            return new Offerings[i];
        }
    }

    public Offerings(Offering offering, Map<String, Offering> map) {
        this.current = offering;
        this.all = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Offerings copy$default(Offerings offerings, Offering offering, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            offering = offerings.current;
        }
        if ((i & 2) != 0) {
            map = offerings.all;
        }
        return offerings.copy(offering, map);
    }

    public final Offering component1() {
        return this.current;
    }

    public final Map<String, Offering> component2() {
        return this.all;
    }

    public final Offerings copy(Offering offering, Map<String, Offering> map) {
        return new Offerings(offering, map);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offerings)) {
            return false;
        }
        Offerings offerings = (Offerings) obj;
        return ur1.a(this.current, offerings.current) && ur1.a(this.all, offerings.all);
    }

    public final Offering get(String str) {
        return getOffering(str);
    }

    public final Map<String, Offering> getAll() {
        return this.all;
    }

    public final Offering getCurrent() {
        return this.current;
    }

    public final Offering getOffering(String str) {
        return this.all.get(str);
    }

    public int hashCode() {
        Offering offering = this.current;
        return this.all.hashCode() + ((offering == null ? 0 : offering.hashCode()) * 31);
    }

    public String toString() {
        return "Offerings(current=" + this.current + ", all=" + this.all + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Offering offering = this.current;
        if (offering == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offering.writeToParcel(parcel, i);
        }
        Map<String, Offering> map = this.all;
        parcel.writeInt(map.size());
        for (Map.Entry<String, Offering> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i);
        }
    }
}
