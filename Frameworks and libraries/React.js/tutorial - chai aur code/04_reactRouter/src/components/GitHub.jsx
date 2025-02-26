import React, { useState, useEffect } from "react";
import { useParams, Link } from "react-router-dom";
import GitHubCalendar from "react-github-calendar";

function GitHub() {
  const { username } = useParams();
  const defaultUsername = "aditya-8-88";

  const [data, setData] = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await fetch(
          `https://api.github.com/users/${username || defaultUsername}`
        );
        const result = await response.json();

        if (result.message === "Not Found") {
          throw new Error(`User ${username || defaultUsername} not found`);
        }

        setTimeout(() => {
          setData(result);
          setLoading(false);
        }, 1000);
      } catch (err) {
        setTimeout(() => {
          setError(err);
          setLoading(false);
        }, 2000);
      }
    };

    fetchData();
  }, [username]);

  if (loading)
    return (
      <div className="min-h-screen flex justify-center items-center">
        <div className="animate-spin rounded-full h-16 w-16 border-t-4 border-b-4 border-orange-500"></div>
      </div>
    );

  if (error)
    return (
      <div className="min-h-screen flex justify-center items-center text-red-500">
        Error: {error.message}
      </div>
    );

  if (!data) return null;

  return (
    <div className="min-h-screen flex justify-center items-center">
      <div className="bg-gray-800 text-white rounded-xl shadow-2xl p-12 m-4 max-w-8xl w-full">
        <div className="flex flex-col md:flex-row items-center gap-8">
          {/* Profile Section */}
          <div className="md:w-1/3">
            <img
              className="w-48 h-48 rounded-full border-4 border-orange-500 shadow-lg mx-auto"
              src={data.avatar_url}
              alt="github profile"
            />
            <div className="mt-8 text-center max-w-full overflow-hidden">
              <div className="px-4 mb-2">
                <h2 className="text-2xl md:text-3xl font-bold whitespace-nowrap overflow-hidden text-ellipsis">
                  {data.name || data.login}
                </h2>
              </div>
              <a
                href={`https://github.com/${data.login}`}
                target="_blank"
                rel="noopener noreferrer"
                className="text-gray-400 hover:text-orange-500 text-lg truncate px-4 transition-colors duration-200"
              >
                @{data.login}
              </a>
            </div>
          </div>

          {/* Details Section */}
          <div className="md:w-2/3 space-y-6">
            {/* Bio and Location */}
            <div className="space-y-2">
              {data.bio && <p className="text-gray-300">{data.bio}</p>}
              {data.location && (
                <p className="text-gray-400">
                  <span className="mr-2">📍</span>
                  {data.location}
                </p>
              )}
              {data.blog && (
                <a
                  href={
                    data.blog.startsWith("http")
                      ? data.blog
                      : `https://${data.blog}`
                  }
                  target="_blank"
                  rel="noopener noreferrer"
                  className="text-orange-500 hover:underline block transition-colors duration-200"
                >
                  🔗 {data.blog}
                </a>
              )}
              {data.twitter_username && (
                <a
                  href={`https://twitter.com/${data.twitter_username}`}
                  target="_blank"
                  rel="noopener noreferrer"
                  className="text-gray-400 hover:text-orange-500 block transition-colors duration-200"
                >
                  <span className="mr-2">🐦</span>@{data.twitter_username}
                </a>
              )}
            </div>

            {/* Stats Grid */}
            <div className="grid grid-cols-2 md:grid-cols-3 gap-4">
              <a
                href={`https://github.com/${data.login}?tab=followers`}
                target="_blank"
                rel="noopener noreferrer"
                className="bg-gray-700 rounded-lg px-4 py-2 hover:bg-gray-600 transition-colors duration-200"
              >
                <div className="text-white font-bold">{data.followers}</div>
                <div className="text-sm text-gray-400">Followers</div>
              </a>

              <a
                href={`https://github.com/${data.login}?tab=following`}
                target="_blank"
                rel="noopener noreferrer"
                className="bg-gray-700 rounded-lg px-4 py-2 hover:bg-gray-600 transition-colors duration-200"
              >
                <div className="text-white font-bold">{data.following}</div>
                <div className="text-sm text-gray-400">Following</div>
              </a>

              <a
                href={`https://github.com/${data.login}?tab=repositories`}
                target="_blank"
                rel="noopener noreferrer"
                className="bg-gray-700 rounded-lg px-4 py-2 hover:bg-gray-600 transition-colors duration-200"
              >
                <div className="text-white font-bold">{data.public_repos}</div>
                <div className="text-sm text-gray-400">Repositories</div>
              </a>
              {data.public_gists > 0 && (
                <div className="bg-gray-700 rounded-lg px-4 py-2">
                  <div className="text-white font-bold">
                    {data.public_gists}
                  </div>
                  <div className="text-sm text-gray-400">Gists</div>
                </div>
              )}
              {data.company && (
                <div className="bg-gray-700 rounded-lg px-4 py-2">
                  <div className="text-white font-bold">{data.company}</div>
                  <div className="text-sm text-gray-400">Company</div>
                </div>
              )}
              <div className="bg-gray-700 rounded-lg px-4 py-2">
                <div className="text-white font-bold">
                  {new Date(data.created_at).toLocaleDateString()}
                </div>
                <div className="text-sm text-gray-400">Joined GitHub</div>
              </div>
            </div>

            {/* Contribution Calendar */}
            <div className="mt-8 p-4 bg-gray-900 rounded-lg">
              <h3 className="text-xl font-bold mb-4">Contributions</h3>
              <GitHubCalendar
                username={username || defaultUsername}
                colorScheme="dark"
                fontSize={12}
                blockSize={12}
                blockMargin={4}
                theme={{
                  dark: [
                    "#1f2937", // Base color (no contributions)
                    "#0e4429", // Light green (few contributions)
                    "#006d32", // Medium green (some contributions)
                    "#26a641", // Bright green (more contributions)
                    "#39d353", // Intense green (most contributions)
                  ],
                }}
              />
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default GitHub;
