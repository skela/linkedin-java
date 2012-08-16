/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package org.linkedin.schema;

import javax.xml.bind.JAXBElement;

public interface SchemaElementFactory<T> {

	/**
	 * Create an instance of {@link HttpHeader }
	 * 
	 */
	public HttpHeader createHttpHeader();

	/**
	 * Create an instance of {@link ThreeCurrentPositions }
	 * 
	 */
	public ThreeCurrentPositions createThreeCurrentPositions();

	/**
	 * Create an instance of {@link InvitationRequest }
	 * 
	 */
	public InvitationRequest createInvitationRequest();

	/**
	 * Create an instance of {@link Facets }
	 * 
	 */
	public Facets createFacets();

	/**
	 * Create an instance of {@link Editor }
	 * 
	 */
	public Editor createEditor();

	/**
	 * Create an instance of {@link Language }
	 * 
	 */
	public Language createLanguage();

	/**
	 * Create an instance of {@link Publisher }
	 * 
	 */
	public Publisher createPublisher();

	/**
	 * Create an instance of {@link Renewal }
	 * 
	 */
	public Renewal createRenewal();

	/**
	 * Create an instance of {@link TwitterAccounts }
	 * 
	 */
	public TwitterAccounts createTwitterAccounts();

	/**
	 * Create an instance of {@link Recipient }
	 * 
	 */
	public Recipient createRecipient();

	/**
	 * Create an instance of {@link PhoneNumber }
	 * 
	 */
	public PhoneNumber createPhoneNumber();

	/**
	 * Create an instance of {@link Like }
	 * 
	 */
	public Like createLike();

	/**
	 * Create an instance of {@link CompanyPersonUpdate }
	 * 
	 */
	public CompanyPersonUpdate createCompanyPersonUpdate();

	/**
	 * Create an instance of {@link HowToApply }
	 * 
	 */
	public HowToApply createHowToApply();

	/**
	 * Create an instance of {@link Action }
	 * 
	 */
	public Action createAction();

	/**
	 * Create an instance of {@link PeopleSearch }
	 * 
	 */
	public PeopleSearch createPeopleSearch();

	/**
	 * Create an instance of {@link Authority }
	 * 
	 */
	public Authority createAuthority();

	/**
	 * Create an instance of {@link RecommendationType }
	 * 
	 */
	public RecommendationType createRecommendationType();

	/**
	 * Create an instance of {@link Answer }
	 * 
	 */
	public Answer createAnswer();

	/**
	 * Create an instance of {@link PublicationAuthor }
	 * 
	 */
	public PublicationAuthor createPublicationAuthor();

	/**
	 * Create an instance of {@link NameType }
	 * 
	 */
	public NameType createNameType();

	/**
	 * Create an instance of {@link Authors }
	 * 
	 */
	public Authors createAuthors();

	/**
	 * Create an instance of {@link Date }
	 * 
	 */
	public Date createDate();

	/**
	 * Create an instance of {@link Visibility }
	 * 
	 */
	public Visibility createVisibility();

	/**
	 * Create an instance of {@link Recommendations }
	 * 
	 */
	public Recommendations createRecommendations();

	/**
	 * Create an instance of {@link ApiStandardProfileRequest }
	 * 
	 */
	public ApiStandardProfileRequest createApiStandardProfileRequest();

	/**
	 * Create an instance of {@link ImAccounts }
	 * 
	 */
	public ImAccounts createImAccounts();

	/**
	 * Create an instance of {@link MailboxItem }
	 * 
	 */
	public MailboxItem createMailboxItem();

	/**
	 * Create an instance of {@link Bucket }
	 * 
	 */
	public Bucket createBucket();

	/**
	 * Create an instance of {@link Answers }
	 * 
	 */
	public Answers createAnswers();

	/**
	 * Create an instance of {@link Skill }
	 * 
	 */
	public Skill createSkill();

	/**
	 * Create an instance of {@link Connections }
	 * 
	 */
	public Connections createConnections();

	/**
	 * Create an instance of {@link Likes }
	 * 
	 */
	public Likes createLikes();

	/**
	 * Create an instance of {@link NetworkStats }
	 * 
	 */
	public NetworkStats createNetworkStats();

	/**
	 * Create an instance of {@link MemberGroups }
	 * 
	 */
	public MemberGroups createMemberGroups();

	/**
	 * Create an instance of {@link ServiceProvider }
	 * 
	 */
	public ServiceProvider createServiceProvider();

	/**
	 * Create an instance of {@link Content }
	 * 
	 */
	public Content createContent();

	/**
	 * Create an instance of {@link StartDate }
	 * 
	 */
	public StartDate createStartDate();

	/**
	 * Create an instance of {@link Education }
	 * 
	 */
	public Education createEducation();

	/**
	 * Create an instance of {@link QuestionCategories }
	 * 
	 */
	public QuestionCategories createQuestionCategories();

	/**
	 * Create an instance of {@link Product }
	 * 
	 */
	public Product createProduct();

	/**
	 * Create an instance of {@link Publication }
	 * 
	 */
	public Publication createPublication();

	/**
	 * Create an instance of {@link EndDate }
	 * 
	 */
	public EndDate createEndDate();

	/**
	 * Create an instance of {@link CompanyType }
	 * 
	 */
	public CompanyType createCompanyType();

	/**
	 * Create an instance of {@link Patent }
	 * 
	 */
	public Patent createPatent();

	/**
	 * Create an instance of {@link CompanyJobUpdate }
	 * 
	 */
	public CompanyJobUpdate createCompanyJobUpdate();

	/**
	 * Create an instance of {@link ExpirationDate }
	 * 
	 */
	public ExpirationDate createExpirationDate();

	/**
	 * Create an instance of {@link Publications }
	 * 
	 */
	public Publications createPublications();

	/**
	 * Create an instance of {@link Role }
	 * 
	 */
	public Role createRole();

	/**
	 * Create an instance of {@link Updates }
	 * 
	 */
	public Updates createUpdates();

	/**
	 * Create an instance of {@link ThreePastPositions }
	 * 
	 */
	public ThreePastPositions createThreePastPositions();

	/**
	 * Create an instance of {@link CurrentShare }
	 * 
	 */
	public CurrentShare createCurrentShare();

	/**
	 * Create an instance of {@link Jobs }
	 * 
	 */
	public Jobs createJobs();

	/**
	 * Create an instance of {@link Job }
	 * 
	 */
	public Job createJob();

	/**
	 * Create an instance of {@link Inventors }
	 * 
	 */
	public Inventors createInventors();

	/**
	 * Create an instance of {@link ProductCategory }
	 * 
	 */
	public ProductCategory createProductCategory();

	/**
	 * Create an instance of {@link Author }
	 * 
	 */
	public Author createAuthor();

	/**
	 * Create an instance of {@link OriginalUpdate }
	 * 
	 */
	public OriginalUpdate createOriginalUpdate();

	/**
	 * Create an instance of {@link CompanyProfileUpdate }
	 * 
	 */
	public CompanyProfileUpdate createCompanyProfileUpdate();

	/**
	 * Create an instance of {@link ProductDeal }
	 * 
	 */
	public ProductDeal createProductDeal();

	/**
	 * Create an instance of {@link Recipients }
	 * 
	 */
	public Recipients createRecipients();

	/**
	 * Create an instance of {@link Headers }
	 * 
	 */
	public Headers createHeaders();

	/**
	 * Create an instance of {@link ItemContent }
	 * 
	 */
	public ItemContent createItemContent();

	/**
	 * Create an instance of {@link Application }
	 * 
	 */
	public Application createApplication();

	/**
	 * Create an instance of {@link ProductType }
	 * 
	 */
	public ProductType createProductType();

	/**
	 * Create an instance of {@link RelatedConnections }
	 * 
	 */
	public RelatedConnections createRelatedConnections();

	/**
	 * Create an instance of {@link RecommendationsGiven }
	 * 
	 */
	public RecommendationsGiven createRecommendationsGiven();

	/**
	 * Create an instance of {@link TwitterAccount }
	 * 
	 */
	public TwitterAccount createTwitterAccount();

	/**
	 * Create an instance of {@link PostingDate }
	 * 
	 */
	public PostingDate createPostingDate();

	/**
	 * Create an instance of {@link JobSuggestions }
	 * 
	 */
	public JobSuggestions createJobSuggestions();

	/**
	 * Create an instance of {@link Activity }
	 * 
	 */
	public Activity createActivity();

	/**
	 * Create an instance of {@link Educations }
	 * 
	 */
	public Educations createEducations();

	/**
	 * Create an instance of {@link OldPosition }
	 * 
	 */
	public OldPosition createOldPosition();

	/**
	 * Create an instance of {@link JobPoster }
	 * 
	 */
	public JobPoster createJobPoster();

	/**
	 * Create an instance of {@link CompanySearch }
	 * 
	 */
	public CompanySearch createCompanySearch();

	/**
	 * Create an instance of {@link EmployeeCountRange }
	 * 
	 */
	public EmployeeCountRange createEmployeeCountRange();

	/**
	 * Create an instance of {@link MemberUrl }
	 * 
	 */
	public MemberUrl createMemberUrl();

	/**
	 * Create an instance of {@link Patents }
	 * 
	 */
	public Patents createPatents();

	/**
	 * Create an instance of {@link Positions }
	 * 
	 */
	public Positions createPositions();

	/**
	 * Create an instance of {@link Status }
	 * 
	 */
	public Status createStatus();

	/**
	 * Create an instance of {@link UpdateContent }
	 * 
	 */
	public UpdateContent createUpdateContent();

	/**
	 * Create an instance of {@link Recommender }
	 * 
	 */
	public Recommender createRecommender();

	/**
	 * Create an instance of {@link MemberGroup }
	 * 
	 */
	public MemberGroup createMemberGroup();

	/**
	 * Create an instance of {@link NewPosition }
	 * 
	 */
	public NewPosition createNewPosition();

	/**
	 * Create an instance of {@link Question }
	 * 
	 */
	public Question createQuestion();

	/**
	 * Create an instance of {@link RelationToViewer }
	 * 
	 */
	public RelationToViewer createRelationToViewer();

	/**
	 * Create an instance of {@link Proficiency }
	 * 
	 */
	public Proficiency createProficiency();

	/**
	 * Create an instance of {@link Certification }
	 * 
	 */
	public Certification createCertification();

	/**
	 * Create an instance of {@link People }
	 * 
	 */
	public People createPeople();

	/**
	 * Create an instance of {@link Position }
	 * 
	 */
	public Position createPosition();

	/**
	 * Create an instance of {@link Network }
	 * 
	 */
	public Network createNetwork();

	/**
	 * Create an instance of {@link Inventor }
	 * 
	 */
	public Inventor createInventor();

	/**
	 * Create an instance of {@link JobBookmark }
	 * 
	 */
	public JobBookmark createJobBookmark();

	/**
	 * Create an instance of {@link Update }
	 * 
	 */
	public Update createUpdate();

	/**
	 * Create an instance of {@link Products }
	 * 
	 */
	public Products createProducts();

	/**
	 * Create an instance of {@link Country }
	 * 
	 */
	public Country createCountry();

	/**
	 * Create an instance of {@link Locations }
	 * 
	 */
	public Locations createLocations();

	/**
	 * Create an instance of {@link Facet }
	 * 
	 */
	public Facet createFacet();

	/**
	 * Create an instance of {@link MemberUrlResources }
	 * 
	 */
	public MemberUrlResources createMemberUrlResources();

	/**
	 * Create an instance of {@link Companies }
	 * 
	 */
	public Companies createCompanies();

	/**
	 * Create an instance of {@link JobBookmarks }
	 * 
	 */
	public JobBookmarks createJobBookmarks();

	/**
	 * Create an instance of {@link PersonActivities }
	 * 
	 */
	public PersonActivities createPersonActivities();

	/**
	 * Create an instance of {@link SiteGroupRequest }
	 * 
	 */
	public SiteGroupRequest createSiteGroupRequest();

	/**
	 * Create an instance of {@link Authorization }
	 * 
	 */
	public Authorization createAuthorization();

	/**
	 * Create an instance of {@link UpdateAction }
	 * 
	 */
	public UpdateAction createUpdateAction();

	/**
	 * Create an instance of {@link UpdateComments }
	 * 
	 */
	public UpdateComments createUpdateComments();

	/**
	 * Create an instance of {@link UpdateComment }
	 * 
	 */
	public UpdateComment createUpdateComment();

	/**
	 * Create an instance of {@link Certifications }
	 * 
	 */
	public Certifications createCertifications();

	/**
	 * Create an instance of {@link Property }
	 * 
	 */
	public Property createProperty();

	/**
	 * Create an instance of {@link Years }
	 * 
	 */
	public Years createYears();

	/**
	 * Create an instance of {@link Languages }
	 * 
	 */
	public Languages createLanguages();

	/**
	 * Create an instance of {@link EmailDomains }
	 * 
	 */
	public EmailDomains createEmailDomains();

	/**
	 * Create an instance of {@link Recommendation }
	 * 
	 */
	public Recommendation createRecommendation();

	/**
	 * Create an instance of {@link RecommendationsReceived }
	 * 
	 */
	public RecommendationsReceived createRecommendationsReceived();

	/**
	 * Create an instance of {@link Recommendee }
	 * 
	 */
	public Recommendee createRecommendee();

	/**
	 * Create an instance of {@link Poster }
	 * 
	 */
	public Poster createPoster();

	/**
	 * Create an instance of {@link ImAccount }
	 * 
	 */
	public ImAccount createImAccount();

	/**
	 * Create an instance of {@link Person }
	 * 
	 */
	public Person createPerson();

	/**
	 * Create an instance of {@link Source }
	 * 
	 */
	public Source createSource();

	/**
	 * Create an instance of {@link Share }
	 * 
	 */
	public Share createShare();

	/**
	 * Create an instance of {@link PhoneNumbers }
	 * 
	 */
	public PhoneNumbers createPhoneNumbers();

	/**
	 * Create an instance of {@link Location }
	 * 
	 */
	public Location createLocation();

	/**
	 * Create an instance of {@link Attribution }
	 * 
	 */
	public Attribution createAttribution();

	/**
	 * Create an instance of {@link QuestionCategory }
	 * 
	 */
	public QuestionCategory createQuestionCategory();

	/**
	 * Create an instance of {@link Company }
	 * 
	 */
	public Company createCompany();

	/**
	 * Create an instance of {@link Skills }
	 * 
	 */
	public Skills createSkills();

	/**
	 * Create an instance of {@link Office }
	 * 
	 */
	public Office createOffice();

	/**
	 * Create an instance of {@link JobSearch }
	 * 
	 */
	public JobSearch createJobSearch();

	/**
	 * Create an instance of {@link SiteStandardProfileRequest }
	 * 
	 */
	public SiteStandardProfileRequest createSiteStandardProfileRequest();

	/**
	 * Create an instance of {@link SiteJobRequest }
	 * 
	 */
	public SiteJobRequest createSiteJobRequest();

	/**
	 * Create an instance of {@link Video }
	 * 
	 */
	public Video createVideo();

	/**
	 * Create an instance of {@link Buckets }
	 * 
	 */
	public Buckets createBuckets();

	/**
	 * Create an instance of {@link DateOfBirth }
	 * 
	 */
	public DateOfBirth createDateOfBirth();

	/**
	 * Create an instance of {@link Error }
	 * 
	 */
	public Error createError();

	/**
	 * Create an instance of {@link ProfileField }
	 * 
	 */
	public ProfileField createProfileField();
	
	public JobFunctions createJobFunctions();
	
	public JobFunction createJobFunction();
	
	public ExperienceLevel createExperienceLevel();
	
	public Industries createIndustries();
	
	public JobType createJobType();
	
	public Industry createIndustry();
	
	public Comment createComment();
	
	public Post createPost();
	
	public GroupMembership createGroupMembership();
	
	public MembershipState createMembershipState();
	
	public EmailDigestFrequency createEmailDigestFrequency();
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createSummary(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createBody(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createHonors(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
	 * 
	 */
	public T createCount(Long value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createPublicProfileUrl(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
	 * 
	 */
	public T createIsLikable(Boolean value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createCurrentStatus(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
	 * 
	 */
	public T createIsCommentable(Boolean value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createMainAddress(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createErrorCode(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
	 * 
	 */
	public T createCurrentStatusTimestamp(Long value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createType(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
	 * 
	 */
	public T createNumRecommenders(Long value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createProviderAccountName(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createThumbnailUrl(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InviteConnectType }{@code >}}
	 * 
	 */
	public T createConnectType(
			InviteConnectType value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createValue(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createWebUrl(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
	 * 
	 */
	public T createYear(Long value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createLastName(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createActivities(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createImAccountName(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createSubmittedImageUrl(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
	 * 
	 */
	public T createProviderAccountId(Long value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createSubmittedUrl(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createCode(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createShortenedUrl(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createUrl(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createRecommendationText(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createAssociations(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
	 * 
	 */
	public T createMonth(Long value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
	 * 
	 */
	public T createDay(Long value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createComment(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createPictureUrl(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createHeadline(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link NetworkUpdateContentType }{@code >}}
	 * 
	 */
	public T createContentType(
			NetworkUpdateContentType value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createInterests(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
	 * 
	 */
	public T createNumResults(Long value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createSubject(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
	 * 
	 */
	public T createIsCurrent(Boolean value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
	 * 
	 */
	public T createIsLiked(Boolean value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
	 * 
	 */
	public T createNumLikes(Long value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createId(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
	 * 
	 */
	public T createTimestamp(Long value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
	 * 
	 */
	public T createDistance(Long value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createTitle(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ImAccountType }{@code >}}
	 * 
	 */
	public T createImAccountType(ImAccountType value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createName(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createRecommendationSnippet(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
	 * 
	 */
	public T createNumConnectionsCapped(Boolean value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createAppId(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createSchoolName(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link NetworkUpdateReturnType }{@code >}}
	 * 
	 */
	public T createUpdateType(NetworkUpdateReturnType value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createUpdateKey(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createMessage(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link PhoneType }{@code >}}
	 * 
	 */
	public T createPhoneType(PhoneType value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createDegree(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createFirstName(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
	 * 
	 */
	public T createSequenceNumber(Long value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
	 * 
	 */
	public T createNumConnections(Long value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createFieldOfStudy(String value);

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	public T createNotes(String value);

}