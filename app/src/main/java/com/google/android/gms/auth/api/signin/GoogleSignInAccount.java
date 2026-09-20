package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.Th;
import defpackage.bl2;
import defpackage.com5Fixed;
import defpackage.np5;
import defpackage.oa3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends com5Fixed implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new np5();
    public final String A;
    public final Uri B;
    public String C;
    public final long D;
    public final String E;
    public final List<Scope> F;
    public final String G;
    public final String H;
    public final HashSet I = new HashSet();
    public final int w;
    public final String x;
    public final String y;
    public final String z;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.w = i;
        this.x = str;
        this.y = str2;
        this.z = str3;
        this.A = str4;
        this.B = uri;
        this.C = str5;
        this.D = j;
        this.E = str6;
        this.F = arrayList;
        this.G = str7;
        this.H = str8;
    }

    public static GoogleSignInAccount f(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString(FacebookAdapter.KEY_ID);
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        Long lValueOf = Long.valueOf(j);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long jLongValue = lValueOf.longValue();
        oa3.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, jLongValue, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.C = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final HashSet b() {
        HashSet hashSet = new HashSet(this.F);
        hashSet.addAll(this.I);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.E.equals(this.E) && googleSignInAccount.b().equals(b());
    }

    public final int hashCode() {
        return b().hashCode() + bl2.a(this.E, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.w);
        Th.J(parcel, 2, this.x);
        Th.J(parcel, 3, this.y);
        Th.J(parcel, 4, this.z);
        Th.J(parcel, 5, this.A);
        Th.I(parcel, 6, this.B, i);
        Th.J(parcel, 7, this.C);
        Th.H(parcel, 8, this.D);
        Th.J(parcel, 9, this.E);
        Th.N(parcel, 10, this.F);
        Th.J(parcel, 11, this.G);
        Th.J(parcel, 12, this.H);
        Th.X(parcel, iP);
    }
}
