package com.revenuecat.purchases;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.models.Transaction;
import com.revenuecat.purchases.parceler.JSONObjectParceler;
import defpackage.mu;
import defpackage.oz1;
import defpackage.ry4;
import defpackage.t92;
import defpackage.ur1;
import defpackage.uy2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchaserInfo implements Parcelable {
    public static final Parcelable.Creator<PurchaserInfo> CREATOR = new Creator();
    private final oz1 activeSubscriptions$delegate;
    private final Map<String, Date> allExpirationDatesByProduct;
    private final Map<String, Date> allPurchaseDatesByProduct;
    private final oz1 allPurchasedSkus$delegate;
    private final EntitlementInfos entitlements;
    private final Date firstSeen;
    private final JSONObject jsonObject;
    private final oz1 latestExpirationDate$delegate;
    private final Uri managementURL;
    private final oz1 nonSubscriptionTransactions$delegate;
    private final String originalAppUserId;
    private final Date originalPurchaseDate;
    private final Set<String> purchasedNonSubscriptionSkus;
    private final Date requestDate;
    private final int schemaVersion;
    private final JSONObject subscriberJSONObject;

    public static final class Creator implements Parcelable.Creator<PurchaserInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PurchaserInfo createFromParcel(Parcel parcel) {
            EntitlementInfos entitlementInfosCreateFromParcel = EntitlementInfos.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(parcel.readString());
            }
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashMap.put(parcel.readString(), parcel.readSerializable());
            }
            int i5 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                linkedHashMap2.put(parcel.readString(), parcel.readSerializable());
            }
            return new PurchaserInfo(entitlementInfosCreateFromParcel, linkedHashSet, linkedHashMap, linkedHashMap2, (Date) parcel.readSerializable(), JSONObjectParceler.INSTANCE.create(parcel), parcel.readInt(), (Date) parcel.readSerializable(), parcel.readString(), (Uri) parcel.readParcelable(PurchaserInfo.class.getClassLoader()), (Date) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PurchaserInfo[] newArray(int i) {
            return new PurchaserInfo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PurchaserInfo(EntitlementInfos entitlementInfos, Set<String> set, Map<String, ? extends Date> map, Map<String, ? extends Date> map2, Date date, JSONObject jSONObject, int i, Date date2, String str, Uri uri, Date date3) {
        this.entitlements = entitlementInfos;
        this.purchasedNonSubscriptionSkus = set;
        this.allExpirationDatesByProduct = map;
        this.allPurchaseDatesByProduct = map2;
        this.requestDate = date;
        this.jsonObject = jSONObject;
        this.schemaVersion = i;
        this.firstSeen = date2;
        this.originalAppUserId = str;
        this.managementURL = uri;
        this.originalPurchaseDate = date3;
        this.activeSubscriptions$delegate = new ry4(new PurchaserInfo$activeSubscriptions$2(this));
        this.allPurchasedSkus$delegate = new ry4(new PurchaserInfo$allPurchasedSkus$2(this));
        this.latestExpirationDate$delegate = new ry4(new PurchaserInfo$latestExpirationDate$2(this));
        this.nonSubscriptionTransactions$delegate = new ry4(new PurchaserInfo$nonSubscriptionTransactions$2(this));
        this.subscriberJSONObject = jSONObject.getJSONObject("subscriber");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<String> activeIdentifiers(Map<String, ? extends Date> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Date> entry : map.entrySet()) {
            Date value = entry.getValue();
            if (value == null || value.after(this.requestDate)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    public static /* synthetic */ void getActiveSubscriptions$annotations() {
    }

    public static /* synthetic */ void getAllPurchasedSkus$annotations() {
    }

    public static /* synthetic */ void getLatestExpirationDate$annotations() {
    }

    public static /* synthetic */ void getNonSubscriptionTransactions$annotations() {
    }

    public static /* synthetic */ void getPurchasedNonSubscriptionSkus$annotations() {
    }

    private static /* synthetic */ void getSubscriberJSONObject$annotations() {
    }

    public final EntitlementInfos component1() {
        return this.entitlements;
    }

    public final Uri component10() {
        return this.managementURL;
    }

    public final Date component11() {
        return this.originalPurchaseDate;
    }

    public final Set<String> component2() {
        return this.purchasedNonSubscriptionSkus;
    }

    public final Map<String, Date> component3() {
        return this.allExpirationDatesByProduct;
    }

    public final Map<String, Date> component4() {
        return this.allPurchaseDatesByProduct;
    }

    public final Date component5() {
        return this.requestDate;
    }

    public final JSONObject component6() {
        return this.jsonObject;
    }

    public final int component7() {
        return this.schemaVersion;
    }

    public final Date component8() {
        return this.firstSeen;
    }

    public final String component9() {
        return this.originalAppUserId;
    }

    public final PurchaserInfo copy(EntitlementInfos entitlementInfos, Set<String> set, Map<String, ? extends Date> map, Map<String, ? extends Date> map2, Date date, JSONObject jSONObject, int i, Date date2, String str, Uri uri, Date date3) {
        return new PurchaserInfo(entitlementInfos, set, map, map2, date, jSONObject, i, date2, str, uri, date3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ur1.a(PurchaserInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.revenuecat.purchases.PurchaserInfo");
        }
        PurchaserInfo purchaserInfo = (PurchaserInfo) obj;
        return ur1.a(getNonSubscriptionTransactions(), purchaserInfo.getNonSubscriptionTransactions()) && ur1.a(this.allExpirationDatesByProduct, purchaserInfo.allExpirationDatesByProduct) && ur1.a(this.allPurchaseDatesByProduct, purchaserInfo.allPurchaseDatesByProduct) && ur1.a(this.entitlements, purchaserInfo.entitlements) && this.schemaVersion == purchaserInfo.schemaVersion && ur1.a(this.firstSeen, purchaserInfo.firstSeen) && ur1.a(this.originalAppUserId, purchaserInfo.originalAppUserId);
    }

    public final Set<String> getActiveSubscriptions() {
        return (Set) this.activeSubscriptions$delegate.getValue();
    }

    public final Map<String, Date> getAllExpirationDatesByProduct() {
        return this.allExpirationDatesByProduct;
    }

    public final Map<String, Date> getAllPurchaseDatesByProduct() {
        return this.allPurchaseDatesByProduct;
    }

    public final Set<String> getAllPurchasedSkus() {
        return (Set) this.allPurchasedSkus$delegate.getValue();
    }

    public final EntitlementInfos getEntitlements() {
        return this.entitlements;
    }

    public final Date getExpirationDateForEntitlement(String str) {
        EntitlementInfo entitlementInfo = this.entitlements.getAll().get(str);
        if (entitlementInfo != null) {
            return entitlementInfo.getExpirationDate();
        }
        return null;
    }

    public final Date getExpirationDateForSku(String str) {
        return this.allExpirationDatesByProduct.get(str);
    }

    public final Date getFirstSeen() {
        return this.firstSeen;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final Date getLatestExpirationDate() {
        return (Date) this.latestExpirationDate$delegate.getValue();
    }

    public final Uri getManagementURL() {
        return this.managementURL;
    }

    public final List<Transaction> getNonSubscriptionTransactions() {
        return (List) this.nonSubscriptionTransactions$delegate.getValue();
    }

    public final String getOriginalAppUserId() {
        return this.originalAppUserId;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final Date getPurchaseDateForEntitlement(String str) {
        EntitlementInfo entitlementInfo = this.entitlements.getAll().get(str);
        if (entitlementInfo != null) {
            return entitlementInfo.getLatestPurchaseDate();
        }
        return null;
    }

    public final Date getPurchaseDateForSku(String str) {
        return this.allPurchaseDatesByProduct.get(str);
    }

    public final Set<String> getPurchasedNonSubscriptionSkus() {
        return this.purchasedNonSubscriptionSkus;
    }

    public final Date getRequestDate() {
        return this.requestDate;
    }

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public int hashCode() {
        return this.originalAppUserId.hashCode() + ((this.firstSeen.hashCode() + ((((this.jsonObject.hashCode() + ((this.requestDate.hashCode() + ((this.allPurchaseDatesByProduct.hashCode() + ((this.allExpirationDatesByProduct.hashCode() + ((getNonSubscriptionTransactions().hashCode() + (this.entitlements.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.schemaVersion) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<PurchaserInfo\n latestExpirationDate: ");
        sb.append(getLatestExpirationDate());
        sb.append("\nactiveSubscriptions:  ");
        Set<String> activeSubscriptions = getActiveSubscriptions();
        ArrayList arrayList = new ArrayList(mu.w0(activeSubscriptions, 10));
        for (String str : activeSubscriptions) {
            arrayList.add(new uy2(str, Collections.singletonMap("expiresDate", getExpirationDateForSku(str))));
        }
        sb.append(t92.V(arrayList));
        sb.append(",\nactiveEntitlements: ");
        Map<String, EntitlementInfo> active = this.entitlements.getActive();
        ArrayList arrayList2 = new ArrayList(active.size());
        Iterator<Map.Entry<String, EntitlementInfo>> it = active.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().toString());
        }
        sb.append(arrayList2);
        sb.append(",\nentitlements: ");
        Map<String, EntitlementInfo> all = this.entitlements.getAll();
        ArrayList arrayList3 = new ArrayList(all.size());
        Iterator<Map.Entry<String, EntitlementInfo>> it2 = all.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList3.add(it2.next().toString());
        }
        sb.append(arrayList3);
        sb.append(",\nnonSubscriptionTransactions: ");
        sb.append(getNonSubscriptionTransactions());
        sb.append(",\nrequestDate: ");
        sb.append(this.requestDate);
        sb.append("\n>");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.entitlements.writeToParcel(parcel, i);
        Set<String> set = this.purchasedNonSubscriptionSkus;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
        Map<String, Date> map = this.allExpirationDatesByProduct;
        parcel.writeInt(map.size());
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeSerializable(entry.getValue());
        }
        Map<String, Date> map2 = this.allPurchaseDatesByProduct;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, Date> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeSerializable(entry2.getValue());
        }
        parcel.writeSerializable(this.requestDate);
        JSONObjectParceler.INSTANCE.write(this.jsonObject, parcel, i);
        parcel.writeInt(this.schemaVersion);
        parcel.writeSerializable(this.firstSeen);
        parcel.writeString(this.originalAppUserId);
        parcel.writeParcelable(this.managementURL, i);
        parcel.writeSerializable(this.originalPurchaseDate);
    }

    public PurchaserInfo(CustomerInfo customerInfo) {
        this(customerInfo.getEntitlements(), customerInfo.getPurchasedNonSubscriptionSkus(), customerInfo.getAllExpirationDatesByProduct(), customerInfo.getAllPurchaseDatesByProduct(), customerInfo.getRequestDate(), customerInfo.getJsonObject(), customerInfo.getSchemaVersion(), customerInfo.getFirstSeen(), customerInfo.getOriginalAppUserId(), customerInfo.getManagementURL(), customerInfo.getOriginalPurchaseDate());
    }
}
