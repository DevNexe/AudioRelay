package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ur1;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class EntitlementInfos implements Parcelable {
    public static final Parcelable.Creator<EntitlementInfos> CREATOR = new Creator();
    private final Map<String, EntitlementInfo> active;
    private final Map<String, EntitlementInfo> all;

    public static final class Creator implements Parcelable.Creator<EntitlementInfos> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntitlementInfos createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), EntitlementInfo.CREATOR.createFromParcel(parcel));
            }
            return new EntitlementInfos(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntitlementInfos[] newArray(int i) {
            return new EntitlementInfos[i];
        }
    }

    public EntitlementInfos(Map<String, EntitlementInfo> map) {
        this.all = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, EntitlementInfo> entry : map.entrySet()) {
            if (entry.getValue().isActive()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.active = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ur1.a(EntitlementInfos.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.revenuecat.purchases.EntitlementInfos");
        }
        EntitlementInfos entitlementInfos = (EntitlementInfos) obj;
        return ur1.a(this.all, entitlementInfos.all) && ur1.a(this.active, entitlementInfos.active);
    }

    public final EntitlementInfo get(String str) {
        return this.all.get(str);
    }

    public final Map<String, EntitlementInfo> getActive() {
        return this.active;
    }

    public final Map<String, EntitlementInfo> getAll() {
        return this.all;
    }

    public int hashCode() {
        return this.active.hashCode() + (this.all.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Map<String, EntitlementInfo> map = this.all;
        parcel.writeInt(map.size());
        for (Map.Entry<String, EntitlementInfo> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i);
        }
    }
}
