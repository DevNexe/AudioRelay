package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.ads.metadata.MediationMetaData;
import defpackage.Th;
import defpackage.as5;
import defpackage.dq6;
import defpackage.fy6;
import defpackage.hd6;
import defpackage.oa3;
import defpackage.q26;
import defpackage.w96;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class AppMeasurement {
    public static volatile AppMeasurement b;
    public final hd6 a;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            oa3.h(bundle);
            this.mAppId = (String) Th.Q(bundle, "app_id", String.class, null);
            this.mOrigin = (String) Th.Q(bundle, "origin", String.class, null);
            this.mName = (String) Th.Q(bundle, MediationMetaData.KEY_NAME, String.class, null);
            this.mValue = Th.Q(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) Th.Q(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) Th.Q(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) Th.Q(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) Th.Q(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) Th.Q(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) Th.Q(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) Th.Q(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) Th.Q(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) Th.Q(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) Th.Q(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) Th.Q(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) Th.Q(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(dq6 dq6Var) {
        this.a = new as5(dq6Var);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (b == null) {
            synchronized (AppMeasurement.class) {
                if (b == null) {
                    fy6 fy6Var = (fy6) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (fy6Var != null) {
                        b = new AppMeasurement(fy6Var);
                    } else {
                        b = new AppMeasurement(dq6.p(context, new w96(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.a.zzp(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.a.b(bundle, str, str2);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.a.zzr(str);
    }

    @Keep
    public long generateEventId() {
        return this.a.zzb();
    }

    @Keep
    public String getAppInstanceId() {
        return this.a.zzh();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List listA = this.a.a(str, str2);
        ArrayList arrayList = new ArrayList(listA == null ? 0 : listA.size());
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.a.zzi();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.a.zzj();
    }

    @Keep
    public String getGmpAppId() {
        return this.a.zzk();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.a.zza(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.a.c(str, str2, z);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.a.e(bundle, str, str2);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        oa3.h(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString(MediationMetaData.KEY_NAME, str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            Th.W(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.a.d(bundle);
    }

    public AppMeasurement(fy6 fy6Var) {
        this.a = new q26(fy6Var);
    }
}
