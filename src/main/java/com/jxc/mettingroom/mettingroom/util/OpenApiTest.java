package com.jxc.mettingroom.mettingroom.util;

import com.moredian.oapi.sdk.DefaultOpenApiClient;
import com.moredian.oapi.sdk.IOpenApiClient;
import com.moredian.oapi.sdk.enums.CertType;
import com.moredian.oapi.sdk.enums.RecognitionMode;
import com.moredian.oapi.sdk.enums.Sex;
import com.moredian.oapi.sdk.exceptions.ClientException;
import com.moredian.oapi.sdk.model.req.*;
import com.moredian.oapi.sdk.model.resp.AbstractOpenApiResponse;
import com.moredian.oapi.sdk.profile.DefaultProfile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class OpenApiTest {

    private final static String BASE_URL = "https://oapi.moredian.com";

    // 此处需要替换成开发者自己的 appId（可在魔点开放平台工作台，我的发布查看）
    private final static String APP_ID = "1658311036513550336";

    // 此处需要替换成开发者自己的 APP_KEY（可在魔点开放平台工作台，我的发布查看）
    private final static String APP_KEY = "nbBVIuL3KZk2mIOFrDKSNLOTF00HJ2UE";

    // 创建机构时返回的 id，需保存
    private final static String ORG_ID = "1630572763309670400";

    // 创建机构时返回的 orgAuthKey，需保存
    private final static String ORG_AUTH_KEY = "IT5l4dFG8J6NLMg115WBw9httKzxxefD";

    // 调用获取 appToken 接口获取
    private final static String APP_TOKEN = "2nlvcSkTMaMnBC9GoNERuJzv2Brqw4HjA1C1S05FpJwj5yxI-q0FXUfOXFvs_BdU";

    // 调用获取机构 accessToken获取
    private final static String ORG_ACCESS_TOKEN = "peuNFIuMykQeuv204qFh1cVJUz1-bWw4Q1poiLHhz_nxn3FrEnKD4hrKDffllN1p";


    /**
     * 获取appToken
     *
     * @throws ClientException 客户端异常
     */
    // // @Test
    public void getAppTokenTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        QueryAppTokenRequest request = new QueryAppTokenRequest();
        request.setAppId(APP_ID);
        request.setAppKey(APP_KEY);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 创建机构
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void createOrgTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        CreateOrgRequest request = new CreateOrgRequest();
        CreateOrgRequest.CreateOrgRequestBody body = new CreateOrgRequest.CreateOrgRequestBody();
        request.setAppToken(APP_TOKEN);

        body.setOrgName("LNJ_TEST_20190412_01");
        body.setAddress("未来科技城");
        body.setContact("联系人");
        body.setPhone("18970970453");

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 修改机构信息
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void updateOrgTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        UpdateOrgRequest request = new UpdateOrgRequest();
        UpdateOrgRequest.UpdateOrgRequestBody body = new UpdateOrgRequest.UpdateOrgRequestBody();
        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setOrgName("LNJ_TEST_20190416_01");
        body.setAddress("未来科技城");
        body.setContact("联系人");
        body.setPhone("18970970453");

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 获取机构accessToken
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void getOrgAccessTokenTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        QueryOrgAccessTokenRequest request = new QueryOrgAccessTokenRequest();
        request.setAppToken(APP_TOKEN);
        request.setOrgAuthKey(ORG_AUTH_KEY);
        request.setOrgId(ORG_ID);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 创建人员
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void createMemberTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        CreateMemberRequest request = new CreateMemberRequest();
        CreateMemberRequest.CreateMemberRequestBody body = new CreateMemberRequest.CreateMemberRequestBody();
        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setTpUserId("2019041611490001");
        body.setMemberName("成员名称");
        body.setVerifyFace(new File("C:\\Users\\17796\\Pictures\\linj.jpg"));
        body.setShowFace(new File("C:\\Users\\17796\\Pictures\\images.jpg"));
        body.setMobile("18970970453");
        body.setNickName("LNJ");
        body.setBirthday("2000-03-09");
        body.setEmail("123456@qq.com");
        body.setSex(Sex.MALE.getValue());
        body.setCertType(CertType.IDENTITY.getValue());
        body.setCertNo("360313200003091378");
        body.setSignature("China");

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 修改人员信息
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void updateMemberTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        UpdateMemberRequest request = new UpdateMemberRequest();
        UpdateMemberRequest.UpdateMemberRequestBody body = new UpdateMemberRequest.UpdateMemberRequestBody();
        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setMemberId(1630577075456835584L);
        body.setMemberName("成员名称");
        body.setVerifyFace(new File("C:\\Users\\17796\\Pictures\\linj.jpg"));
        body.setShowFace(new File("C:\\Users\\17796\\Pictures\\images.jpg"));
        body.setMobile("18970970452");
        body.setNickName("LNJ_UPDATE");
        body.setBirthday("2000-03-14");
        body.setEmail("1234567@qq.com");
        body.setSex(Sex.MALE.getValue());
        body.setCertType(CertType.IDENTITY.getValue());
        body.setCertNo("360313200003091378");
        body.setSignature("China_UPDATE");

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 增加人员群组关系
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void memberBindGroup() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        MemberBindGroupRequest request = new MemberBindGroupRequest();
        MemberBindGroupRequest.MemberBindGroupRequestBody body = new MemberBindGroupRequest.MemberBindGroupRequestBody();
        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setMemberId(1630577075456835584L);
        body.setGroupId(1630577247255527424L);

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 移除人员群组关系
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void memberUnbindGroup() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        MemberUnbindGroupRequest request = new MemberUnbindGroupRequest();
        MemberUnbindGroupRequest.MemberUnbindGroupRequestBody body = new MemberUnbindGroupRequest.MemberUnbindGroupRequestBody();
        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setMemberId(1630577075456835584L);
        body.setGroupId(1630577247255527424L);

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 删除人员
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void deleteMember() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        DeleteMemberRequest request = new DeleteMemberRequest();
        DeleteMemberRequest.DeleteMemberRequestBody body = new DeleteMemberRequest.DeleteMemberRequestBody();
        request.setAccessToken("hwwwvoZamOH7ZeKHf2Qp7qEkareJULimGjntf106ShllhjPhFJhh8kksr3pl9-DB");

        body.setMemberId(1627970468386439168L);

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 修改识别照片
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void memberUpdateVerifyImg() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        MemberUpdateVerifyImgRequest request = new MemberUpdateVerifyImgRequest();
        MemberUpdateVerifyImgRequest.MemberUpdateVerifyImgRequestBody body = new MemberUpdateVerifyImgRequest.MemberUpdateVerifyImgRequestBody();
        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setMemberId(1630577075456835584L);
        body.setVerifyFace(new File("C:\\Users\\17796\\Pictures\\linj.jpg"));

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 修改个性头像
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void memberUpdateShowImg() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        MemberUpdateShowImgRequest request = new MemberUpdateShowImgRequest();
        MemberUpdateShowImgRequest.MemberUpdateShowImgRequestBody body = new MemberUpdateShowImgRequest.MemberUpdateShowImgRequestBody();
        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setMemberId(1630577075456835584L);
        body.setShowFace(new File("C:\\Users\\17796\\Pictures\\52a02e668907f.jpg"));

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 新增群组
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void createGroupTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        CreateGroupRequest request = new CreateGroupRequest();
        CreateGroupRequest.CreateGroupRequestBody body = new CreateGroupRequest.CreateGroupRequestBody();
        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setTpGroupId("201904161155000000001");
        body.setGroupName("测试 Open Api SDK 新增群组-20190416");

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 修改群组
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void updateGroupTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        UpdateGroupRequest request = new UpdateGroupRequest();
        UpdateGroupRequest.UpdateGroupRequestBody body = new UpdateGroupRequest.UpdateGroupRequestBody();
        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setGroupId(1630577247255527424L);
        body.setGroupName("测试 Open Api SDK 修改群组");

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 设备激活
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void deviceActivationTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        DeviceActivationRequest request = new DeviceActivationRequest();
        DeviceActivationRequest.DeviceActivationRequestBody body = new DeviceActivationRequest.DeviceActivationRequestBody();
        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setQrCode("du4hche372j8t99438s72nqccajkm1c45gqp");

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 根据 sn 获取设备 id
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void queryDeviceIdTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        QueryDeviceIdRequest request = new QueryDeviceIdRequest();
        request.setAccessToken(ORG_ACCESS_TOKEN);
        request.setDeviceSn("070101180725KN0078");

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 更新设备控制信息
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void updateDeviceControllerInfoTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        UpdateDeviceControllerInfoRequest request = new UpdateDeviceControllerInfoRequest();
        UpdateDeviceControllerInfoRequest.UpdateDeviceControllerInfoRequestBody body = new UpdateDeviceControllerInfoRequest.UpdateDeviceControllerInfoRequestBody();

        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setDeviceId(1630576800578928640L);
        body.setMultiPerson(RecognitionMode.MULTI_PERSON.getValue());
        body.setControlDoorTime(5000);

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }


    /**
     * 设备群组绑定
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void deviceGroupBindingTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        DeviceGroupBindingRequest request = new DeviceGroupBindingRequest();
        DeviceGroupBindingRequest.DeviceGroupBindingRequestBody body = new DeviceGroupBindingRequest.DeviceGroupBindingRequestBody();

        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setDeviceId(1630576800578928640L);
        List<Long> groupIdList = new ArrayList<Long>();
        groupIdList.add(1630577247255527424L);
        body.setGroupIdList(groupIdList);

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 设备群组配置
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void deviceGroupConfigurationTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        DeviceGroupConfigurationRequest request = new DeviceGroupConfigurationRequest();
        DeviceGroupConfigurationRequest.DeviceGroupConfigurationRequestBody body = new DeviceGroupConfigurationRequest.DeviceGroupConfigurationRequestBody();

        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setDayBeginTime("00:00");
        body.setDayEndTime("23:59");
        body.setGroupId(1630577247255527424L);
        body.setWeekdays("1,2,3,4,5,6,7");

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 注册回调
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void addOrgCallbackTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        AddOrgCallbackRequest request = new AddOrgCallbackRequest();
        AddOrgCallbackRequest.AddOrgCallbackRequestBody body = new AddOrgCallbackRequest.AddOrgCallbackRequestBody();

        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setCallbackUrl("https://www.google.com");
        body.setCallbackTag("REC_SUCCESS,REC_FAIL");

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 修改回调
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void updateOrgCallbackTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        UpdateOrgCallbackRequest request = new UpdateOrgCallbackRequest();
        UpdateOrgCallbackRequest.UpdateOrgCallbackRequestBody body = new UpdateOrgCallbackRequest.UpdateOrgCallbackRequestBody();

        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setCallbackUrl("https://www.google.com/test");
        body.setCallbackTag("REC_SUCCESS,REC_FAIL");

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 修改回调
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void deleteOrgCallbackTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        DeleteOrgCallbackRequest request = new DeleteOrgCallbackRequest();
        request.setAccessToken(ORG_ACCESS_TOKEN);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 解绑设备
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void deviceUnbindTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        DeviceUnbindRequest request = new DeviceUnbindRequest();
        DeviceUnbindRequest.DeviceUnbindRequestBody body = new DeviceUnbindRequest.DeviceUnbindRequestBody();

        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setDeviceId(1630574550016065536L);

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }

    /**
     * 设备后台管理密码获取
     *
     * @throws ClientException 客户端异常
     */
    // @Test
    public void queryDeviceDynamicPwdTest() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(BASE_URL);

        QueryDeviceDynamicPwdRequest request = new QueryDeviceDynamicPwdRequest();
        QueryDeviceDynamicPwdRequest.QueryDeviceDynamicPwdRequestBody body = new QueryDeviceDynamicPwdRequest.QueryDeviceDynamicPwdRequestBody();

        request.setAccessToken(ORG_ACCESS_TOKEN);

        body.setDeviceId(1630576800578928640L);
        body.setTimestamp(1555040486393L);

        request.setBody(body);

        IOpenApiClient client = new DefaultOpenApiClient(profile);
        AbstractOpenApiResponse response = client.getResponse(request);
        System.out.println(response);
    }
}
