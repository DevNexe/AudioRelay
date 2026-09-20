package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bl2;
import defpackage.oz1;
import defpackage.ry4;
import defpackage.ur1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class Offering implements Parcelable {
    public static final Parcelable.Creator<Offering> CREATOR = new Creator();
    private final List<Package> availablePackages;
    private final String identifier;
    private final String serverDescription;
    private final oz1 lifetime$delegate = new ry4(new Offering$lifetime$2(this));
    private final oz1 annual$delegate = new ry4(new Offering$annual$2(this));
    private final oz1 sixMonth$delegate = new ry4(new Offering$sixMonth$2(this));
    private final oz1 threeMonth$delegate = new ry4(new Offering$threeMonth$2(this));
    private final oz1 twoMonth$delegate = new ry4(new Offering$twoMonth$2(this));
    private final oz1 monthly$delegate = new ry4(new Offering$monthly$2(this));
    private final oz1 weekly$delegate = new ry4(new Offering$weekly$2(this));

    public static final class Creator implements Parcelable.Creator<Offering> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Offering createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Package.CREATOR.createFromParcel(parcel));
            }
            return new Offering(string, string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Offering[] newArray(int i) {
            return new Offering[i];
        }
    }

    public Offering(String str, String str2, List<Package> list) {
        this.identifier = str;
        this.serverDescription = str2;
        this.availablePackages = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Offering copy$default(Offering offering, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offering.identifier;
        }
        if ((i & 2) != 0) {
            str2 = offering.serverDescription;
        }
        if ((i & 4) != 0) {
            list = offering.availablePackages;
        }
        return offering.copy(str, str2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Package findPackage(PackageType packageType) {
        Object next;
        Iterator<T> it = this.availablePackages.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (ur1.a(((Package) next).getIdentifier(), packageType.getIdentifier())) {
                return (Package) next;
            }
        }
        next = null;
        return (Package) next;
    }

    public static /* synthetic */ void getAnnual$annotations() {
    }

    public static /* synthetic */ void getLifetime$annotations() {
    }

    public static /* synthetic */ void getMonthly$annotations() {
    }

    public static /* synthetic */ void getSixMonth$annotations() {
    }

    public static /* synthetic */ void getThreeMonth$annotations() {
    }

    public static /* synthetic */ void getTwoMonth$annotations() {
    }

    public static /* synthetic */ void getWeekly$annotations() {
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.serverDescription;
    }

    public final List<Package> component3() {
        return this.availablePackages;
    }

    public final Offering copy(String str, String str2, List<Package> list) {
        return new Offering(str, str2, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offering)) {
            return false;
        }
        Offering offering = (Offering) obj;
        return ur1.a(this.identifier, offering.identifier) && ur1.a(this.serverDescription, offering.serverDescription) && ur1.a(this.availablePackages, offering.availablePackages);
    }

    public final Package get(String str) {
        return getPackage(str);
    }

    public final Package getAnnual() {
        return (Package) this.annual$delegate.getValue();
    }

    public final List<Package> getAvailablePackages() {
        return this.availablePackages;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Package getLifetime() {
        return (Package) this.lifetime$delegate.getValue();
    }

    public final Package getMonthly() {
        return (Package) this.monthly$delegate.getValue();
    }

    public final Package getPackage(String str) {
        for (Package r1 : this.availablePackages) {
            if (ur1.a(r1.getIdentifier(), str)) {
                return r1;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final String getServerDescription() {
        return this.serverDescription;
    }

    public final Package getSixMonth() {
        return (Package) this.sixMonth$delegate.getValue();
    }

    public final Package getThreeMonth() {
        return (Package) this.threeMonth$delegate.getValue();
    }

    public final Package getTwoMonth() {
        return (Package) this.twoMonth$delegate.getValue();
    }

    public final Package getWeekly() {
        return (Package) this.weekly$delegate.getValue();
    }

    public int hashCode() {
        return this.availablePackages.hashCode() + bl2.a(this.serverDescription, this.identifier.hashCode() * 31, 31);
    }

    public String toString() {
        return "Offering(identifier=" + this.identifier + ", serverDescription=" + this.serverDescription + ", availablePackages=" + this.availablePackages + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.identifier);
        parcel.writeString(this.serverDescription);
        List<Package> list = this.availablePackages;
        parcel.writeInt(list.size());
        Iterator<Package> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }
}
