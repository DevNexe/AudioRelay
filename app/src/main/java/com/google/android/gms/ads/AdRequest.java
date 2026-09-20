package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.internal.ads.zzcgn;
import defpackage.oa3;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class AdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    public final zzdr a;

    public static class Builder {
        public final zzdq a;

        public Builder() {
            zzdq zzdqVar = new zzdq();
            this.a = zzdqVar;
            zzdqVar.zzw("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.a.zzr(cls, bundle);
            return this;
        }

        public Builder addKeyword(String str) {
            this.a.zzt(str);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
            zzdq zzdqVar = this.a;
            zzdqVar.zzu(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                zzdqVar.zzx("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public AdRequest build() {
            return new AdRequest(this);
        }

        @Deprecated
        public Builder setAdInfo(AdInfo adInfo) {
            this.a.zzy(adInfo);
            return this;
        }

        public Builder setAdString(String str) {
            this.a.zzz(str);
            return this;
        }

        public Builder setContentUrl(String str) {
            if (str == null) {
                throw new NullPointerException("Content URL must be non-null.");
            }
            oa3.f("Content URL must be non-empty.", str);
            boolean z = str.length() <= 512;
            Object[] objArr = {Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH), Integer.valueOf(str.length())};
            if (!z) {
                throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", objArr));
            }
            this.a.zzB(str);
            return this;
        }

        public Builder setHttpTimeoutMillis(int i) {
            this.a.zzD(i);
            return this;
        }

        public Builder setNeighboringContentUrls(List<String> list) {
            if (list == null) {
                zzcgn.zzj("neighboring content URLs list should not be null");
                return this;
            }
            this.a.zzF(list);
            return this;
        }

        public Builder setRequestAgent(String str) {
            this.a.zzH(str);
            return this;
        }

        @Deprecated
        public final Builder zza(String str) {
            this.a.zzw(str);
            return this;
        }

        @Deprecated
        public final Builder zzb(Date date) {
            this.a.zzA(date);
            return this;
        }

        @Deprecated
        public final Builder zzc(int i) {
            this.a.zzC(i);
            return this;
        }

        @Deprecated
        public final Builder zzd(boolean z) {
            this.a.zzE(z);
            return this;
        }

        @Deprecated
        public final Builder zze(boolean z) {
            this.a.zzI(z);
            return this;
        }
    }

    public AdRequest(Builder builder) {
        this.a = new zzdr(builder.a, null);
    }

    public String getContentUrl() {
        return this.a.zzl();
    }

    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.a.zzd(cls);
    }

    public Bundle getCustomTargeting() {
        return this.a.zze();
    }

    public Set<String> getKeywords() {
        return this.a.zzr();
    }

    public List<String> getNeighboringContentUrls() {
        return this.a.zzp();
    }

    public <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.a.zzf(cls);
    }

    public boolean isTestDevice(Context context) {
        return this.a.zzt(context);
    }

    public zzdr zza() {
        return this.a;
    }
}
